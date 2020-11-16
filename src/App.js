import React from 'react';
import Header from './header.js';
import Footer from './footer.js';
import Title from './title.js';
import logo from './logo.svg';
import Image from './image.js'
import './App.css';
require('./App.css');

function App() {
  return (
    <div className="logo">
    <Header></Header>
    <Title></Title>
    </div>
    
    
  );
}

const container = document.createElement('div');
document.body.appendChild(container);

export default App;
