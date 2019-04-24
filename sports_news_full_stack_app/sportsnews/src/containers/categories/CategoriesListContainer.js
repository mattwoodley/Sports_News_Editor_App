import React, {Component} from 'react';
import ArticleList from '../../components/articles/ArticleList.js';
import Request from '../../helpers/request.js';

class CategoriesListContainer extends Component {

//props are passed in from app, set up a blank state to receive article to be passed down to components, edit and delete are bound at object scope and passed down to component
  constructor(props){
    super(props);
    this.state = {articles: null}
  }


  componentDidMount(){
    let request = new Request();
    request.get('/api/categories').then((data) => {
      this.setState({articles: data._embedded.categories})
    })
  }

  render(){
    if(!this.state.articles){
      return null;
    }
    return (
      <div className="component">
        <ArticleList articles={this.state.articles}/>
      </div>
    )

  }
}

export default CategoriesListContainer;
