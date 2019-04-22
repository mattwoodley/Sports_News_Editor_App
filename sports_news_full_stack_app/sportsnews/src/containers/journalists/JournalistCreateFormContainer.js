import React, {Component} from 'react';
import JournalistCreateForm from '../../components/journalists/JournalistCreateForm.js';
import Request from '../../helpers/request.js';

class JournalistCreateFormContainer extends Component {

  constructor(props){
    super(props);
    this.handleJournalistPost = this.handleJournalistPost.bind(this);
  }

  //make a post request to api, giving it the article in JSON
  handleArticlePost(journalists){
    const request = new Request();
    request.post('/api/journalists', journalist).then(() => {
      window.location = '/journalists'
    });
  }

  //render an ArticleCreateForm, feed it available journalists and categories as well as functionality to actually post to be rendered in button
  render(){

    return (
      <JournalistCreateForm
        handleArticlePost={this.handleArticlePost}
      />
    )
  }
}

export default JournalistCreateFormContainer;
