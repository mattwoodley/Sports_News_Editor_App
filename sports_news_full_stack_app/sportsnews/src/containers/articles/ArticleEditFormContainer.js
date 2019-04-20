import React, {Component} from 'react';
import ArticleEditForm from '../../components/articles/ArticleEditForm.js';
import Request from '../../helpers/request.js';

//container requires categories,journalists and an article as we'll be populating edit form

class ArticleEditFormContainer extends Component {
  constructor(props){
    super(props);
    this.state = {article: null, journalists: null, categories: null};
    this.handleArticleEdit = this.handleArticleEdit.bind(this);
  }

//when mounted get the single article using id from props, along with full suite of categories and journalists

  componentDidMount(){
    const request = new Request();

    request.get("/api/articles/" + this.props.id + "?projection=embedJournalist").then((article) => {
      this.setState({article: article})
    });

    request.get("/api/categories").then((categories) => {
      this.setState({categories: categories._embedded.categories})
    });

    request.get("/api/journalists").then((journalists) => {
      this.setState({journalists: journalists._embedded.journalists})
    });
  }

//create the edit function to be passed down to component
  handleArticleEdit(article){
    const request = new Request();
    request.patch('/api/articles/' + this.props.id, article).then(() => {
      window.location = '/articles/' + this.props.id
    })
  }

//render a loading screen while waiting or the ArticleEditForm handing down categories, journalists and teh article to be edited
  render(){
    if(!this.state.categories || !this.state.article || !this.state.journalists){
      return <h1>Please Wait...</h1>;
    }
    return <ArticleEditForm categories = {this.state.categories} article={this.state.article} journalists={this.state.journalists} handleArticleEdit= {this.handleArticleEdit} />

  }
}

export default ArticleEditFormContainer;
