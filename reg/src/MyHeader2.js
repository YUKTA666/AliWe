import React, { useState } from 'react'; 
import {Route, Link, Routes} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import './MyHeader.css';
import App from './App';
import { useAuth } from './AuthContext';
const MyHeader2 = () => {
    const { isLoggedIn, username, login, logout } = useAuth();
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
            <Link to="/tests">Tests</Link>
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
          <li>
            {isLoggedIn ? (
              <>
                <span className="username">{username}</span>
                <button onClick={logout}>Logout</button>
              </>
            ) : (
              <Link to="/">Logout</Link>
            )}
          </li>
        </ul>
      </nav>
        
      </header>

    );
  };
  
  export default MyHeader2;