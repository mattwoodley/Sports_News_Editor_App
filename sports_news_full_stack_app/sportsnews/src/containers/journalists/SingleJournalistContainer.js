import React, {Component} from 'react';
import JournalistDetails from '../../components/journalists/JournalistDetails.js';
import Request from '../../helpers/request.js';

class SingleJournalistContainer extends Component {
  constructor(props){
    super(props);
    this.state = {journalist: null}
    this.handleDelete = this.handleDelete.bind(this)
    this.handleEdit= this.handleEdit.bind(this)
  }

//when the component mounts, grab a single journalist as well as the details of the articles contained within journalist, set state to include this journalist to be passed down
  componentDidMount(){
    let request = new Request()
    const url = '/api/journalists/' + this.props.id + '?projection=embedArticle';
    request.get(url).then((data) => {
      this.setState({journalist: data})
    })
  }

// this function will be passed down to journalistdetail component for rendering there
// make a request to back end api to delete journalist based on id, then return to /journalists route (journlalistListContainer)
  handleDelete(id){
    const request = new Request();
    const url = '/api/journalists/' + id;
    request.delete(url).then(() => {
      window.location = '/journalists'
    })
  }

// again, passed down to journalistDetails component, provides that
  handleEdit(id){
    window.location = '/journalists/edit/' + id
  }

//compulsory React render function it has to return something so in the event there is no journalist return nothing to save console.error()
// else return the journalistdetails component - feed it props of the whole journalist object - the embedded articles  and the two functions above to be used to edit/delete from articleDetail view

  render(){
    if(!this.state.journalist){
      return null;
    }
    return (
      <div className="component">
       <JournalistDetails journalist = {this.state.journalist} articles={this.state.journalist._embedded.articles} handleDelete = {this.handleDelete} handleEdit={this.handleEdit}/>
     </div>
    )

  }
}

export default SingleJournalistContainer;
