import React from "react";
import 'bootstrap/dist/css/bootstrap.css';
import "./Tests.css";
import {Link} from 'react-router-dom';

import MyHeader from "./MyHeader";
import MyFooter from "./MyFooter";
import mech from "./image/mech.jpeg";
import cse from "./image/cse.jpeg";
import entc from "./image/entc.jpeg";
import ai from "./image/ai.jfif";
import robotics from "./image/robotics.jfif";
import civil from "./image/civil.jfif";
import MyHeader2 from "./MyHeader2";
export default function Tests(){
    return(
        <div>
            <MyHeader2/>
            <div className="cards main">
                <div className="card main">
                    <img src={cse} className="card-img-top main" alt="cse"/>
                    <div className="card-body main">
                        <h5 className="card-title main">Computer Science</h5>
                        <Link to="/tests/cse" className="btn btn-primary">Test</Link>
                    </div>
                </div>
                <div className="card main">
                    <img src={entc} className="card-img-top main" alt="entc"/>
                    <div className="card-body main">
                        <h5 className="card-title main">Electronics and Communication</h5>
                        <a href="#" className="btn btn-primary">Test</a>
                    </div>
                </div>
                <div className="card main" >
                    <img src={mech} className="card-img-top main" alt="mech"/>
                    <div className="card-body main">
                        <h5 className="card-title main">Mechanical Engineering</h5>
                        <a href="#" className="btn btn-primary">Test</a>
                    </div>
                </div>
            </div>
            <div className="cards main">
                <div className="card main">
                    <img src={ai} className="card-img-top main" alt="cse"/>
                    <div className="card-body main">
                        <h5 className="card-title main">Artificial Intelligence</h5>
                        <a href="#" className="btn btn-primary">Test</a>
                    </div>
                </div>
                <div className="card main">
                    <img src={robotics} className="card-img-top main" alt="entc"/>
                    <div className="card-body main">
                        <h5 className="card-title main">Robotics</h5>
                        <a href="#" className="btn btn-primary">Test</a>
                    </div>
                </div>
                <div className="card main" >
                    <img src={civil} className="card-img-top main" alt="mech"/>
                    <div className="card-body main">
                        <h5 className="card-title main">Civil Engineering</h5>
                        <Link to="/civil" className="btn btn-primary">Test</Link>
                    </div>
                </div>
            </div>
            <MyFooter/>
        </div>
    );
}