import React, {Component} from 'react';
import JournalistEditForm from '../../components/journalists/JournalistEditForm.js';
import Request from '../../helpers/request.js';

class JournalistEditFormContainer extends Component {
  constructor(props){
    super(props);
    this.state = {journalist: null}
    this.handleArticleEdit = this.handleArticleEdit.bind(this);
  }

//when mounted get the single journalist using id from props, along with full suite of categories

  componentDidMount(){
    const request = new Request();

    request.get("/api/journalists").then((journalists) => {
      this.setState({journalists: journalists})
    });
  }

//create the edit function to be passed down to component
  handleJournalistEdit(journalist){
    const request = new Request();
    request.patch('/api/journalists/' + this.props.id, journalist).then(() => {
      window.location = '/journalists/' + this.props.id
    })
  }

//render a loading screen while waiting or the JournalistEditForm handing down the journalist and full suite of categories, journalists and teh article to be edited
  render(){
    if( !this.state.journalist){
      return <h1>Please Wait...</h1>;
    }
    return <JournalistEditForm journalist={this.state.journalist} handleArticleEdit= {this.handleArticleEdit} />

  }
}

export default JournalistEditFormContainer;
