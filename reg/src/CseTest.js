

import "./CseTest.css";
import {Route, Link, Routes} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import MyHeader2 from "./MyHeader2";
import MyFooter from "./MyFooter";
import React, { useState } from "react";
// Question.js

const questions = [
    // Question 1
    {
      questionText: "Question 1: What is the CPU?",
      answerOptions: [
        { answerText: "Central Processing Unit", isCorrect: true },
        { answerText: "Computer Personal Unit", isCorrect: false },
        { answerText: "Central Process Unit", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Question 2
    {
      questionText: "Question 2: What does RAM stand for?",
      answerOptions: [
        { answerText: "Random Access Memory", isCorrect: true },
        { answerText: "Read-Only Memory", isCorrect: false },
        { answerText: "Run-All Memory", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Add more questions below
    // Question 3
    {
      questionText: "Question 3: What is an operating system?",
      answerOptions: [
        { answerText: "Software that manages computer hardware", isCorrect: true },
        { answerText: "A type of computer", isCorrect: false },
        { answerText: "A programming language", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Question 4
    {
      questionText: "Question 4: What is binary code?",
      answerOptions: [
        { answerText: "A code using 0s and 1s to represent information", isCorrect: true },
        { answerText: "A secret code used by computers", isCorrect: false },
        { answerText: "A code used for barcoding", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Question 5
    {
      questionText: "Question 5: What does GPU stand for?",
      answerOptions: [
        { answerText: "Graphics Processing Unit", isCorrect: true },
        { answerText: "General Processing Unit", isCorrect: false },
        { answerText: "Gaming Personal Unit", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Add more questions below
    // Question 6
    {
      questionText: "Question 6: What is an algorithm?",
      answerOptions: [
        { answerText: "A step-by-step set of instructions to solve a problem", isCorrect: true },
        { answerText: "A type of computer hardware", isCorrect: false },
        { answerText: "A programming language", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Question 7
    {
      questionText: "Question 7: What is object-oriented programming (OOP)?",
      answerOptions: [
        { answerText: "A programming paradigm based on objects and classes", isCorrect: true },
        { answerText: "A type of computer memory", isCorrect: false },
        { answerText: "A data storage format", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Question 8
    {
      questionText: "Question 8: What is a compiler?",
      answerOptions: [
        { answerText: "A program that translates source code into machine code", isCorrect: true },
        { answerText: "A type of computer virus", isCorrect: false },
        { answerText: "A computer keyboard", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Question 9
    {
      questionText: "Question 9: What is a database?",
      answerOptions: [
        { answerText: "A structured collection of data", isCorrect: true },
        { answerText: "A type of computer monitor", isCorrect: false },
        { answerText: "A computer network", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
    // Question 10
    {
      questionText: "Question 10: What is a firewall?",
      answerOptions: [
        { answerText: "A security system that controls incoming and outgoing network traffic", isCorrect: true },
        { answerText: "A type of computer processor", isCorrect: false },
        { answerText: "A computer game", isCorrect: false },
        { answerText: "None of the above", isCorrect: false },
      ],
    },
  ];
  
  const branches = [
    {
      name: "Civil Engineering",
      description: "Explore Civil Engineering",
      link : "/civil"
    },
    {
      name: "Mechanical Engineering",
      description: "Explore Mechanical Engineering",
    },
    {
      name: "Artificial Intelligence",
      description: "Explore Artificial Intelligence",
    },
  ];
  
  const ComputerEngineeringQuiz = () => {
    const [currentQuestion, setCurrentQuestion] = useState(0);
    const [score, setScore] = useState(0);
    const [showResult, setShowResult] = useState(false);
  
    const handleAnswerOptionClick = (isCorrect) => {
      if (isCorrect) {
        setScore(score + 1);
      }
  
      const nextQuestion = currentQuestion + 1;
      if (nextQuestion < questions.length) {
        setCurrentQuestion(nextQuestion);
      } else {
        setShowResult(true);
      }
    };
  
    const restartQuiz = () => {
      setCurrentQuestion(0);
      setScore(0);
      setShowResult(false);
    };
  
    return (
        <>
        <MyHeader2/>
      <div className="quiz-container">
        {showResult ? (
          <div className="result-container">
            <h2 className="result-heading">Quiz Results</h2>
            <p className="result-message">
              {score >= 5
                ? "Congratulations! You should explore the following branches:"
                : "You should explore more options."}
            </p>
            {branches.map((branch, index) => (
              <p key={index} className="branch-link">
                
                <Link to="/tests">{branch.name}</Link>
                : {branch.description}
              </p>
              
            ))}
            <button className="restart-button" onClick={restartQuiz}>
              Restart Quiz
            </button>
          </div>
        ) : (
          <div className="question-container">
            <h2 className="question-heading">{questions[currentQuestion].questionText}</h2>
            <div className="options-container">
              {questions[currentQuestion].answerOptions.map((option, index) => (
                <button
                  key={index}
                  className="option-button"
                  onClick={() => handleAnswerOptionClick(option.isCorrect)}
                >
                  {option.answerText}
                </button>
              ))}
            </div>
          </div>
        )}
      </div>
      <MyFooter/>
      </>
    );
  };
  
  export default ComputerEngineeringQuiz
