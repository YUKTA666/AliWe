import React from "react";
import "./About.css";
import phil from "./image/philosophy.jpg";
import stre from "./image/strengths.jpg";
import peda from "./image/pedagogy.jpg";
import acc from "./image/accord.jpg";
import MyHeader from "./MyHeader";
import MyFooter from "./MyFooter";


export default function About(){
    return(
        
        <>
        <MyHeader/>
        <div className="about-us">
         <div className="centered-content"></div> 
         <h1 className="center-h1">About Us</h1>
         <div className="about-us">
         <div className="about-box">
          <p>The Virtual Engineering Stream Assistant project aims to provide 
    students with guidance and support in choosing the best engineering 
    stream based on their skills and interests. By developing and 
    administering tests, analyzing data using propositional logic, generating 
    reports.
    </p>
    <p>
    It also got the Virtual College Section for Engineering Disciplines which is 
    a comprehensive resource for students seeking information about a 
    particular discipline. This section provides students with all the 
    information they need including syllabus, job opportunities, and future 
    scope to help them make informed decisions about their education and 
    career. 
    </p>
          {/* Add more content */}
          </div>
        </div>
        <div className="outer-wrapper">
        <div>
        <div className="row">
                <div className="philospy">
                    <span><img src={phil} alt="Philosophy"/></span>
                    <h2>Our Philosophy</h2>
                    <p className="lead">
                        Students spend 70% of their adult life at the workplace. Career decisions are one of the most important decisions in a student's academic and professional journey. It is essential that these decisions are made with utmost care and expertise.
                    </p>
                </div>
                <div className="strength">
                    <span><img src={stre} alt="Strength"/></span>
                    <h2>Our Strengths</h2>
                    <p className="lead">
                        We blend artificial intelligence and machine learning with strategic human interventions to enable career success. Our management team, advisory board and psychometric team bring unparalleled experience in the domain with the singular aim to help students.
                    </p>
                </div>
                
                <div className="pedagogy">
                    <span><img src={peda} alt="Pedagogy"/></span>
                    <h2> Methodology</h2>
                    <p className="lead">
                        We aim to minimize human bias in the career decision making process. We leverage technology and research to help students in making informed career decisions. Our platform and experts together simplify this process.
                    </p>
                </div>
                <div className="accord">
                    <span><img src={acc} alt="Accord"/></span>
                    <h2>Our Accord</h2>
                    <p className="lead">
                        We are a group of Students Studying in CDAC (ACTS), technology whiz-student. Trust us with your career decisions as we help you figure out your true self and help you craft your success stories.
                    </p>
                </div>
               </div>
            </div>
        </div>
        </div>
    <MyFooter/>
        </>
    
    );
}