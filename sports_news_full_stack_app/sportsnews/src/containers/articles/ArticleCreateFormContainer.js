import React, {Component} from 'react';
import ArticleCreateForm from '../../components/articles/ArticleCreateForm.js';
import Request from '../../helpers/request.js';

class ArticleCreateFormContainer extends Component {

  //you'll need categories and journalists to populate any new article
  //post article function should bind to here from ArticleCreateForm button
  constructor(props){
    super(props);
    this.state = {categories: [], journalists: []};
    this.handleArticlePost = this.handleArticlePost.bind(this);
  }

//once the component is up and running make a get request to db API to populate the category/journalist selections
  componentDidMount(){
    const request = new Request();
    request.get("/api/categories").then((data) => {
      this.setState({categories: data._embedded.categories})
    }).then(() => {
      request.get('/api/journalists').then((data) => {
        this.setState({journalists: data._embedded.journalists})
      });
    });
  }

//make a post request to api, giving it the article in JSON
  handleArticlePost(article){
    const request = new Request();
    request.post('/api/articles', article).then(() => {
      window.location = '/articles'
    })


  }

//render an ArticleCreateForm, feed it available journalists and categories as well as functionality to actually post to be rendered in button
  render(){

    return <ArticleCreateForm
      journalists={this.state.journalists}
      categories={this.state.categories}
      handleArticlePost={this.handleArticlePost}
      />

  }
}

export default ArticleCreateFormContainer;
