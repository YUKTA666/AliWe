import React, { useState } from "react";
import ReactDOM from "react-dom";
import "./Login.css";
// import bg from "./image/bg5.webp"
import axios from 'axios';
import MyHeader from "./MyHeader";
import MyFooter from "./MyFooter";
import { useNavigate } from "react-router-dom";
import {Route, Link, Routes} from 'react-router-dom';
function Login() {
  // React States
  
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);
  const [token, setToken] = useState(null); 
  const [loginError, setLoginError] = useState(""); 
  // User Login info

  const errors = {
    uname: "invalid email",
    pass: "invalid password"
  };
  const navigate = useNavigate();
  const handleSubmit = async (event) => {
    event.preventDefault();
    const { email, pass } = event.target.elements;

    try {
        const response = await axios.post('http://localhost:8080/auth/signin', {
            email: email.value,
            password: pass.value,
        });

        if (response.status === 200) {
            setToken(response.data.token);
            setIsSubmitted(true);
            navigate("/tests");
        } else {
            setLoginError("Invalid email or password");
        }
    } catch (error) {
        // Handle API request error or display a generic error message
        setErrorMessages({ name: "pass", message: "An error occurred" });
    }
};

  // Generate JSX code for error message
  const renderErrorMessage = (email) =>
    email === errorMessages.email && (
      <div className="error">{errorMessages.message}</div>
    );

    const getAuthHeaders = () => {
      if (token) {
          return {
              headers: {
                  Authorization: `Bearer ${token}`,
              },
          };
      }
      return {};
  };

  const fetchUserData = async () => {
    try {
        const response = await axios.get('/api/user-data', getAuthHeaders());

        if (response.status === 200) {
            console.log(response.data); // Handle user data
        }
    } catch (error) {
        // Handle API request error or unauthorized access
        console.error(error);
    }
};
  // JSX code for login form
  
  const renderForm = (
    <>
   
    <div className="form" >
      <form onSubmit={handleSubmit}>
        <div className="input-container">
          <label>Email </label>
          <input type="text" name="email" required />
          {renderErrorMessage("email")}
        </div>
        <div className="input-container">
          <label>Password </label>
          <input type="password" name="pass" required />
          {renderErrorMessage("pass")}
        </div>
        <div className="other">
          Do you have an account?  <Link to="/signup">Get Started</Link>
        </div>
        <div >
          {/* <input type="submit" /> */}
          <button className="button">Login</button>
        </div>
      </form>
    </div>
  
    </>
  );

  return (
    <>
    <MyHeader/>
    <div className="app">
    <div className="login-form">
        <div className="title">Login </div>
        {isSubmitted ? (
            <div>User is successfully logged in</div>
        ) : (
            <>
                {renderForm}
                <button onClick={fetchUserData} hidden>Login</button>
            </>
        )}
    </div>
</div>
<MyFooter/>
</>
  );
  
}

export default Login;