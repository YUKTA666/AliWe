import React from "react";
import './MyFooter.css';
import {Route, Link, Routes} from 'react-router-dom';

export default function MyFooter(){
    return(
        <footer className="bg-dark">
            <div>
            <p>&copy; 2023 AliWe (An Engineering Stream Assistant). All rights reserved.</p>
            <Link to="/contactus">Contact Us</Link>
            </div>
        </footer>
    );
}