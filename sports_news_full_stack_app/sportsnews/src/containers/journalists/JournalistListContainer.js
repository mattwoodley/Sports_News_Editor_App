import React, {Component} from 'react';
import JournalistList from '../../components/journalists/JournalistList.js';
import Request from '../../helpers/request.js';

class JournalistListContainer extends Component {
  constructor(props){
    super(props);
    this.state = {journalists: []}
  }

//link in to back end api to fetch all journalists store in state
componentDidMount(){
    let request = new Request();
    request.get('/api/journalists').then((data) => {
      this.setState({journalists: data._embedded.journalists})
    })
  }


//render the main journalist  list (which itself renders individual microjournalists)
  render(){
    return (
     <JournalistList journalist = {this.state.journalists} />
    )
  }
}

export default JournalistListContainer;
