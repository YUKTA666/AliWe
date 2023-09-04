import React, { useState } from "react";
import './CseTest.css';
import MyFooter from "./MyFooter";
import MyHeader2 from "./MyHeader2";
import {Route, Link, Routes} from 'react-router-dom';
const questions = [
  // Question 1
  {
    questionText: "Question 1: What is the primary function of a foundation in civil engineering?",
    answerOptions: [
      { answerText: "To support and distribute the load of a structure to the soil", isCorrect: true },
      { answerText: "To provide aesthetic appeal to a building", isCorrect: false },
      { answerText: "To insulate the building from weather conditions", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Question 2
  {
    questionText: "Question 2: What is the purpose of a retaining wall?",
    answerOptions: [
      { answerText: "To prevent soil erosion and retain soil at different levels", isCorrect: true },
      { answerText: "To provide shade to outdoor areas", isCorrect: false },
      { answerText: "To act as a sound barrier", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Add more questions below
  // Question 3
  {
    questionText: "Question 3: What is a beam in civil engineering?",
    answerOptions: [
      { answerText: "A horizontal structural member that supports loads applied laterally", isCorrect: true },
      { answerText: "A type of column", isCorrect: false },
      { answerText: "A roofing material", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Question 4
  {
    questionText: "Question 4: What is the purpose of soil testing in civil engineering?",
    answerOptions: [
      { answerText: "To assess the engineering properties of soil for construction purposes", isCorrect: true },
      { answerText: "To determine the chemical composition of soil", isCorrect: false },
      { answerText: "To measure soil temperature", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Question 5
  {
    questionText: "Question 5: What is a load-bearing wall in construction?",
    answerOptions: [
      { answerText: "A wall that supports the structural load of a building", isCorrect: true },
      { answerText: "A wall with decorative patterns", isCorrect: false },
      { answerText: "A wall used for insulation", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Add more questions below
  // Question 6
  {
    questionText: "Question 6: What is a cantilever beam?",
    answerOptions: [
      { answerText: "A beam that is supported at one end and protrudes horizontally", isCorrect: true },
      { answerText: "A type of suspension bridge", isCorrect: false },
      { answerText: "A type of arch bridge", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Question 7
  {
    questionText: "Question 7: What is the purpose of a geotechnical investigation?",
    answerOptions: [
      { answerText: "To assess subsurface conditions for construction projects", isCorrect: true },
      { answerText: "To design decorative elements in landscaping", isCorrect: false },
      { answerText: "To study the behavior of marine life", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Question 8
  {
    questionText: "Question 8: What is the term for the process of compacting soil to increase its density?",
    answerOptions: [
      { answerText: "Soil compaction", isCorrect: true },
      { answerText: "Soil expansion", isCorrect: false },
      { answerText: "Soil erosion", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Question 9
  {
    questionText: "Question 9: What is the purpose of a culvert in civil engineering?",
    answerOptions: [
      { answerText: "To allow the passage of water under a road or railway", isCorrect: true },
      { answerText: "To store rainwater for irrigation", isCorrect: false },
      { answerText: "To provide structural support to a building", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
  // Question 10
  {
    questionText: "Question 10: What is a slump test used for in concrete technology?",
    answerOptions: [
      { answerText: "To measure the consistency of fresh concrete", isCorrect: true },
      { answerText: "To determine the weight of concrete blocks", isCorrect: false },
      { answerText: "To assess the strength of hardened concrete", isCorrect: false },
      { answerText: "None of the above", isCorrect: false },
    ],
  },
];

const branches = [
  {
    name: "Structural Engineering",
    description: "Explore Structural Engineering",
  },
  {
    name: "Geotechnical Engineering",
    description: "Explore Geotechnical Engineering",
  },
  {
    name: "Transportation Engineering",
    description: "Explore Transportation Engineering",
  },
];

const Civil = () => {
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

export default Civil;
