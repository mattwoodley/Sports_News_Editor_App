import React, {Component} from 'react';
import {Link} from 'react-router-dom';

import Request from '../helpers/request.js';

class NavBar extends Component {
  render() {
    return(
      <React.Fragment>
        <nav>
        <Link className='navButton' to="/">Home</Link>
        <Link className='navButton' to="/articles">Articles</Link>
        <Link className='navButton' to="/journalists">Journalists</Link>
        <Link className='navButton' to="/categories">Categories</Link>
    </nav>
    </React.Fragment>
    )
  }
}

export default NavBar;
