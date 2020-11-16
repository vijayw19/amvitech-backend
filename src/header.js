import React from 'react';
import Tabs from './Tabs';
import './App.css';

function Header() {
  return (
    <Tabs>
      <div label="Home">
        <h2><p className="a">Welcome to Amvitech home page</p> </h2>
      </div>
      <div label="contact me">
        <h2><p className="b">Mailing Address<br/>
          Apt no-1108, 
          11 Overlea Drive<br/>
          Kitchener, Ontario, Canada- N2M5C8<br/>
          Email id: vijay.yadav.d1rv@gmail.com<br/>
		  Phone:- 2269782803
        </p></h2>
      </div>
      <div label="Enquiry">
        <p><a className="color" href="https://linkedin.com/in/vijay-yadav-a58765119">LinkedIn</a><br />
        <a className="color" href="https://github.com/vijayw19">GitHub</a>
        </p>
      </div>

    </Tabs>
    
  );
}

export default Header;
