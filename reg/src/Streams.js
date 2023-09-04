import React from "react";
import 'bootstrap/dist/css/bootstrap.css';
import "./Streams.css";
import {Route, Link, Routes} from 'react-router-dom';
import MyHeader from "./MyHeader";
import MyFooter from "./MyFooter";
import mech from "./image/mech.jpeg";
import cse from "./image/cse.jpeg";
import entc from "./image/entc.jpeg";
import ai from "./image/ai.jfif";
import robotics from "./image/robotics.jfif";
import civil from "./image/civil.jfif";

export default function Streams(){
    return(
        <div>
             <MyHeader/>
            <div className="cards">
                <div className="card">
                    <img src={cse} className="card-img-top" alt="cse"/>
                    <div className="card-body">
                        <h5 className="card-title">Computer Science</h5>
                        <a href="#" className="btn btn-primary">View</a>
                    </div>
                </div>
                <div className="card">
                    <img src={entc} className="card-img-top" alt="entc"/>
                    <div className="card-body">
                        <h5 className="card-title">Electronics and Communication</h5>
                        <a href="#" className="btn btn-primary">View</a>
                    </div>
                </div>
                <div className="card" >
                    <img src={mech} className="card-img-top" alt="mech"/>
                    <div className="card-body">
                        <h5 className="card-title">Mechanical Engineering</h5>
                        <a href="#" className="btn btn-primary">View</a>
                    </div>
                </div>
            </div>
            <div className="cards">
                <div className="card">
                    <img src={ai} className="card-img-top" alt="cse"/>
                    <div className="card-body">
                        <h5 className="card-title">Artificial Intelligence</h5>
                        <Link to="/ai" className="btn btn-primary">View</Link>
                    </div>
                </div>
                <div className="card">
                    <img src={robotics} className="card-img-top" alt="entc"/>
                    <div className="card-body">
                        <h5 className="card-title">Robotics</h5>
                        <a href="#" className="btn btn-primary">View</a>
                    </div>
                </div>
                <div className="card" >
                    <img src={civil} className="card-img-top" alt="mech"/>
                    <div className="card-body">
                        <h5 className="card-title">Civil Engineering</h5>
                        <a href="#" className="btn btn-primary">View</a>
                    </div>
                </div>
            </div>
            <MyFooter/>
        </div>
    );
}