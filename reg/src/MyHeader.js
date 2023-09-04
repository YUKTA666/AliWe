import React, { useState } from 'react'; 
import {Route, Link, Routes} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import './MyHeader.css';
import App from './App';

const MyHeader = () => {
    return (
      <header className="bg-dark-header">
        <div className="left-heading">
                <h1>AliWe</h1>
                <p>All Is Well</p>
        </div>
       
        <nav className="nav-bar">
            <ul>
                <li>
                    <Link to="/">Home</Link>
                </li>
               
                <li>
                    <Link to="/streams">Streams</Link>
                </li>
                <li>
                    <Link to="/askaway">AskAway</Link>
                </li>
                <li>
                    <Link to="/about">About</Link>
                </li>

                <ul>
                <li className="split">
                    <Link to="/login">Login</Link>
                </li>
                <li className="split">
                    <Link to="/signup">SignUp</Link>
                </li>
            </ul>
            </ul>
        </nav>
        <Routes>
            <Route path="/home" element={<App />} />
		</Routes>
      </header>

    );
  };
  
  export default MyHeader;