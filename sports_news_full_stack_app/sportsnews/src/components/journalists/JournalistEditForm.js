import React, {Component} from 'react';

class JournalistEditForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      "firstName": props.journalist.firstName,
      "surname": props.journalist.surname,
      "image": props.journalist.image
    }
    this.handleSubmit = this.handleSubmit.bind(this)
  }

  //stop the page refreshing, create the new journalist object using form below and submit to container handleArticlePost function
  handleSubmit(event){
    event.preventDefault();
    const updateJournalist = {
      "firstName": this.state.firstName,
      "surname": this.state.surname,
      "image": this.state.image
    }
    this.props.handleJournalistEdit(updateJournalist);

  }

  //render form
  render(){

    //autopopulate with existing values from props, then update state
    return (
      <div>
        <form onSubmit={this.handleSubmit}>
          <label for="firstName">First Name:</label>
          <input required type="text" id='firstName' name="firstName" value={this.state.firstName} onChange={evt=>this.setState({firstName: evt.target.value})} />
          <label for="surname">Last Name:</label>
          <input required type="text" id='surname' name="surname" value={this.state.surname} onChange={evt=>this.setState({surname: evt.target.value})}/>
          <label for="image">Image path:</label>
          <input required type="text" id='image' name="image" value={this.state.image} onChange={evt=>this.setState({image: evt.target.value})}/>
          <button type="submit">Save Journalist</button>
        </form>
      </div>
    )
  }
};

export default JournalistEditForm;
