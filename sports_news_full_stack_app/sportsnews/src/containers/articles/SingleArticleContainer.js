import React, {Component} from 'react';
import ArticleDetails from '../../components/articles/ArticleDetails.js';
import Request from '../../helpers/request.js';

//props are passed in from app, set up a blank state to receive article to be passed down to components, edit and delete are bound at object scope and passed down to component
class SingleArticleContainer extends Component {
  constructor(props){
    super(props);
    this.state = {article: null}
    this.handleDelete = this.handleDelete.bind(this)
    this.handleEdit= this.handleEdit.bind(this)
  }

//when the component mounts, grab a single article as well as the details of the journalist contained within article, set state to include this article to be passed down
  componentDidMount(){
    let request = new Request();
    const url = '/api/articles/' + this.props.id + '?projection=embedJournalist';
    request.get(url).then((data) => {
      this.setState({article: data})
    })
  }

// this function will be passed down to ArticleDetails component for rendering there
// make a request to back end api to delete article based on id, then return to /articles route (articleListContainer)
  handleDelete(id){
    const request = new Request();
    const url = '/api/articles/' + id;
    request.delete(url).then(() => {
      window.location = '/articles'
    })
  }

// again, passed down to ArticleDetails component, provides that functionality down to ArticleDetails
  handleEdit(id){
    window.location = '/articles/edit/' + id
  }

//compulsory React render function it has to return something so in the event there is no article return nothing to save console.error()
// else return the ArticleDetails component - feed it props of the whole article object - the embedded journalist object and the two functions above to be used to edit/delete from ArticleDetails view
//TODO - come back and feed journalist down
  render(){
    if(!this.state.article){
      return null;
    }
    return (
      <div className="articledetail">
       <ArticleDetails id={this.props.id} article = {this.state.article} journalist={this.state.article._embedded.journalist} handleDelete = {this.handleDelete} handleEdit={this.handleEdit}/>
     </div>
    )

  }
}

export default SingleArticleContainer;
