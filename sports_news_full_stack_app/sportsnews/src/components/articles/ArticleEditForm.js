import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class ArticleEditForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      "headline": props.article.headline,
      "summary": props.article.summary,
      "fullstory": props.article.fullstory,
      "dateCreated": props.article.date,
      "image": props.article.image,
      "readCount": props.article.readCount,
      "category": props.article.category,
      "journalist": props.article.journalist
    }
    this.handleSubmit = this.handleSubmit.bind(this)
  }

  //stop the page refreshing, create the new article object using form below and submit to container handleArticlePost function
  handleSubmit(event){
    event.preventDefault();
    const updateArticle = {
      "headline": this.state.headline,
      "summary": this.state.summary,
      "fullstory": this.state.fullstory,
      "dateCreated": this.state.dateCreated,
      "image": this.state.image,
      "readCount": this.state.readCount,
      "category": event.target.category.value,
      "journalist": event.target.journalist.value
    }
    this.props.handleArticlePost(updateArticle);

  }

  //render form
  render(){
    //retrieve categories from props and store dropdown options in variable
    const categories = this.props.categories.map((category, index) => {
      return <option key={index} value={category._links.self.href}>{category.name}</option>
    })

    //retrieve journalists from props and store dropdown options in variable
    const journalists = this.props.journalists.map((journalist, index) => {
      return <option key={index} value={journalist._links.self.href}>{journalist.firstName} {journalist.surname}</option>
    })

    //autopopulate with existing values from props, then update state
    return (
      <div>
        <form onSubmit={this.handleSubmit}>

          <label for="journalist">Journalist:</label>
          <select id='journalist' name="journalist" onChange={evt=>this.setState({journalist: evt.target.value})} >
            {journalists}
          </select>
          <Link to = "/journalists/new">New Journalist?</Link>
          <label for="date">Article Date:</label>
          <input type="date" id='date' value={this.state.dateCreated} name="dateCreated" onChange={evt=>this.setState({date: evt.target.value})}/>

          <label for="headline">Headline:</label>
          <input type="text" id='headline' name="headline" value={this.state.headline} onChange={evt=>this.setState({headline: evt.target.value})} />

          <label for="summary">Summary:</label>
          <input type="text" id='summary' name="summary" value={this.state.summary} onChange={evt=>this.setState({summary: evt.target.value})}/>

          <label for="image">Image path:</label>
          <input type="text" id='image' name="image" value={this.state.image} onChange={evt=>this.setState({image: evt.target.value})}/>

          <label for="fullstory">Full Story:</label>
          <textarea name="fullstory" id='fullstory' wrap="hard" rows="10" cols="50" value={this.state.fullstory} onChange={evt=>this.setState({fullstory: evt.target.value})}></textarea>

          <label for="category">Category:</label>
          <select id='category' name="category" onChange={evt=>this.setState({journalist: evt.target.value})}>
            {categories}
          </select>

          <button type="submit">Save Article</button>
        </form>
      </div>
    )
  }
}


export default ArticleEditForm;
