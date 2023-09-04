import React, { createContext, useContext, useState } from 'react';

// Create the AuthContext
const AuthContext = createContext();

// Create an AuthProvider component
const AuthProvider = ({ children }) => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [username, setUsername] = useState('');
  
  const login = (username) => {
    setIsLoggedIn(true);
    setUsername(username);
  };

  const logout = () => {
    setIsLoggedIn(false);
    setUsername('');
  };

  return (
    <AuthContext.Provider value={{ isLoggedIn, username, login, logout }}>
      {children}
    </AuthContext.Provider>
  );
};

// Custom hook for using the AuthContext
const useAuth = () => {
  return useContext(AuthContext);
};

export { AuthProvider, useAuth };