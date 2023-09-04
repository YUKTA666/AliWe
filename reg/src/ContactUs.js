// ContactForm.js
import React, { useState } from 'react';
import './ContactUs.css';
import { FaTwitter, FaInstagram, FaEnvelope, FaMapMarkerAlt,FaMobileAlt} from 'react-icons/fa';
import MyHeader from './MyHeader';
import MyFooter from './MyFooter';

const ContactUs = () => {
  const [fullName, setFullName] = useState('');
  const [email, setEmail] = useState('');
  const [message, setMessage] = useState('');
  const [emailError, setEmailError] = useState('');

  const validateEmail = (email) => {
    const re = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return re.test(email);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    
    if (!validateEmail(email)) {
      setEmailError('Please enter a valid email address');
      return;
    }
    
    // You can add your logic here to handle form submission
    console.log('Form submitted:', { fullName, email, message });
  };

  return (
    <>
    <MyHeader/>
    <div className="main-container">
      
    <div className="contact-form-container">
      <h2>Contact Us</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="fullName">Full Name</label>
          <textarea
            id="fullName"
            className="fixed-textarea"
            value={fullName}
            onChange={(e) => setFullName(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="email">Email</label>
          <textarea
            id="email"
            className="fixed-textarea"
            value={email}
            onChange={(e) => {
              setEmail(e.target.value);
              setEmailError('');
            }}
            onBlur={() => {
              if (email && !validateEmail(email)) {
                setEmailError('Please enter a valid email address');
              }
            }}
            required
          />
          {emailError && <p className="error-message">{emailError}</p>}
        </div>
        <div className="form-group">
          <label htmlFor="message">Message</label>
          <textarea
            id="message"
            value={message}
            onChange={(e) => setMessage(e.target.value)}
            rows="5"
            required
          />
        </div>
        <button type="submit" class="btn btn-outline-primary">Submit</button>
      </form>
    </div>

    <div className='links'>
    <div className="icons">
    
      <a href="https://twitter.com/your_twitter_username">
        <FaTwitter size={32} className="icon twitter-icon"/>
      </a>
      <a href="https://www.instagram.com/your_instagram_username">
        <FaInstagram size={32} className="icon instagram-icon"/>
      </a>
      <a href="mailto:your.email@gmail.com">
        <FaEnvelope size={32} className="icon email-icon"/>
      </a>
      <a href="https://www.google.com/maps/place/your_address">
        <FaMapMarkerAlt size={32} className="icon map-icon"/>
      </a>
      <a href="tel:987-654-3210"> {}
        <FaMobileAlt size={24} className="icon mobile-icon"/> 
      </a>
    </div>
    </div>
    </div>
    <MyFooter/>
    </>

  );
};

export default ContactUs;