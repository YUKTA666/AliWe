import React from 'react';
import {Route, Link, Routes} from 'react-router-dom';

import Home from "./Home.js";
import SignUpForm from './SignUpForm';
import About from './About';
import Tests from './Tests';
import Streams from './Streams';
import ContactUs from './ContactUs';
import Login from './Login';
import AskAway from './AskAway';
import './App.css';
import CseTest from './CseTest.js';
import Ai from "./Ai.js"
import Civil from './Civil.js';

function App() {
  return (
    
    <div classNameName="App">
      <Routes>
      <Route path="/" element={<Home />} />
				<Route path="/signup" element={<SignUpForm />} />
        <Route path="/about" element={<About />} />
				<Route path="/tests" element={<Tests />} />
        <Route path="/tests/cse" element={<CseTest />} />
        <Route path="/streams" element={<Streams />} />
				<Route path="/contactus" element={<ContactUs />} />
        <Route path="/login" element={<Login />} />
        <Route path="/askaway" element={<AskAway />} />
        <Route path="/ai" element={<Ai/>}/>
        <Route path="/civil" element={<Civil/>}/>
        <Route path="/cseteste" element={<CseTest/>}/>
			</Routes>    
    </div>
    
  );
}

export default App;