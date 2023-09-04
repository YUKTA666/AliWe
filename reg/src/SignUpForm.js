
import './SignUpForm.css';
import MyHeader from './MyHeader';
import MyFooter from './MyFooter';
import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
// import {FormField} from "react-bootstrap";
// import { Form, Col, FormGroup, Checkbox } from 'react-bootstrap' 

class FormField extends Component {
  render() {
    const { name, label, type, value, onChange, error, required } = this.props;

    return (
      <div className="form-group">
        <label htmlFor={name}>{label}:</label>
        <input
          type={type}
          className={`form-control ${error ? 'is-invalid' : ''}`}
          id={name}
          name={name}
          value={value}
          onChange={onChange}
          required={required}
        />
        {error && <div className="invalid-feedback">{error}</div>}
      </div>
    );
  }
}

class SignUpForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      username: '',
      email: '',
      password: '',
      confirmPassword: '',
      userType: 'ENGINEER',
      errors: {},
    };
  }
   
 

  validateForm = () => {
    const {
    
      username,
      email,
      password,
      confirmPassword,
    } = this.state;
    const errors = {};

    
    if (!username) {
      errors.username = 'Username is mandatory';
    }
    if (!email) {
      errors.email = 'Email is mandatory';
    }
    if (!password) {
      errors.password = 'Password is mandatory';
    }
    if (!confirmPassword) {
      errors.confirmPassword = 'Confirm Password is mandatory';
    }
    if (password !== confirmPassword && confirmPassword !== '') {
      errors.confirmPassword = 'Passwords do not match';
    }

    return errors;
  };

  handleChange = (e) => {
    const { name, value } = e.target;
    this.setState({ [name]: value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const errors = this.validateForm();

    if (Object.keys(errors).length === 0) {
        const userData = {
            "email": this.state.email,
            "name": this.state.username,
            "password": this.state.password,
            "role": this.state.userType,
          };
    
          // Send a POST request to the Spring Boot API
          axios
            .post('http://localhost:8080/auth/signup', userData)
            .then((response) => {
              console.log('Registration successful:', response.data);
              // You can redirect to a login page or display a success message here
            })
            .catch((error) => {
              console.error('Registration failed:', error);
              // Handle errors, e.g., display an error message to the user
            });
        
    } else {
      this.setState({ errors });
    }
  };

  render() {
    const { errors } = this.state;

    return (
      <>
      <MyHeader/>
      <div className="signup-container">
        <div className='signup-form'>
        <div className="title-signup">SignUp </div>
        <form onSubmit={this.handleSubmit}>
         
          <FormField
            name="username"
            label="Username"
            type="text"
            value={this.state.username}
            onChange={this.handleChange}
            error={errors.username}
            required
          />
          <FormField
            name="email"
            label="Email"
            type="email"
            value={this.state.email}
            onChange={this.handleChange}
            error={errors.email}
            required
          />
          <FormField
            name="password"
            label="Password"
            type="password"
            value={this.state.password}
            onChange={this.handleChange}
            error={errors.password}
            required
          />
          <FormField
            name="confirmPassword"
            label="Confirm Password"
            type="password"
            value={this.state.confirmPassword}
            onChange={this.handleChange}
            error={errors.confirmPassword}
            required
          />
          <div className="form-group">
            <label htmlFor="userType">User Type:</label>
            <select
              className="form-control"
              id="userType"
              name="userType"
              value={this.state.userType}
              onChange={this.handleChange}
            >
              <option value="ENGINEER">ENGINEER</option>
              <option value="STUDENT">STUDENT</option>
            </select>
          </div>
          <button type="submit" className="button-signup" >
            Register
          </button>
        </form>
        </div>
      </div>
      <MyFooter/>
      </>
    );
  }
}

export default SignUpForm;