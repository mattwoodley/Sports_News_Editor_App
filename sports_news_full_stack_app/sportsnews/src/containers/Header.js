import React, {Component} from 'react';
import Request from '../helpers/request.js';
import NavBar from './NavBar';

class Header extends Component {
  render() {
    return(
      <React.Fragment>
        <header>
      <h1>Score</h1>
      <h3>The Edge of Sports News</h3>
      <NavBar/>
    </header>
    </React.Fragment>
    )
  }
}

export default Header;
