import React from 'react';
import {Route, Link, Routes} from 'react-router-dom';

import "./Home.css";
import MyHeader from './MyHeader';
import MyFooter from './MyFooter';
import mech from "./image/mech.jpeg";
import cse from "./image/cse.jpeg";
import entc from "./image/entc.jpeg";

export default function Home(){
    return (
        <>
        <MyHeader/>
        <main>
        <section>
          <h2>Welcome to Engineering Stream Assistant</h2>
          <h5>Our platform helps students and engineers determine which engineering stream is best suited for them based on their skills and interests.</h5>
          <br/>
          <Link to="/login">Get Started</Link>
        </section>
        <section>
          <h2>Streams</h2>
          <ul>
            <li><div className="flip-card">
              <div className="flip-card-inner">
                <div className="flip-card-front">
                <img src={cse} alt="entc" width={230} height={270}/>
                </div>
                <div className="flip-card-back">
                <h3>Computer Science</h3>
                <p>Computer science is the study of computers and computational systems which includes everything from the algorithms that make up software to how software interacts with hardware to how well software is developed and designed.</p>
                </div>
              </div>
              </div></li>
            <li><div className="flip-card">
              <div className="flip-card-inner">
                <div className="flip-card-front">
                <img src={entc} alt="entc" width={230} height={270}/>
                </div>
                <div className="flip-card-back">
                <h3>Electronics & Telecommunication</h3>
                <p>Electronics and telecommunications engineering is a modern engineering discipline that deals with designing, fabricating, producing, testing and supervising the manufacturing process of complex electronic products and systems.</p>
                </div>
              </div>
              </div></li>
            <li><div className="flip-card">
              <div className="flip-card-inner">
                <div className="flip-card-front">
                <img src={mech} alt="entc" width={230} height={270}/>
                </div>
                <div className="flip-card-back">
                <h3>Mechanical</h3>
                <p>Mechanical engineering is the study of physical machines that may involve force and movement. It is an engineering branch that combines engineering physics and mathematics principles with materials science, to design, analyze, manufacture, and maintain mechanical systems.</p>
                </div>
              </div>
              </div></li>
          </ul>
        </section>
        <section>
          <blockquote>
            <p>"Empower yourself with Engineering Stream Assistant to create lifelong career success in the field of engineering"</p>
          </blockquote>
        </section>
      </main>
      <MyFooter/>
      </>
    );
}