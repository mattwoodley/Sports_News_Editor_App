import React, {Component} from 'react';
import ArticleList from '../../components/articles/ArticleList.js';
import Request from '../../helpers/request.js';


class ArticleListContainer extends Component {
  constructor(props){
    super(props);
    this.state = {articles: []}
  }

//link in to back end api to fetch all articles store in state, TODO sort conditions TODO investigate embedded?
  componentDidMount(){
    let request = new Request()
    request.get('/api/articles').then((data) => {
      this.setState({articles: data._embedded.articles})
    })
  }

//render the main article list (which itself renders individual microarticles)
  render(){
    return (
     <ArticleList articles = {this.state.articles} />
    )
  }
}

export default ArticleListContainer;
