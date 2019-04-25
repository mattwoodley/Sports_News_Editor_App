import React from 'react';
import {Link} from 'react-router-dom';

//stateless component, passed down props journalists,categories and handleArticlePost function from ArticleCreateFormContainer
const ArticleCreateForm = (props) => {

  //stop the page refreshing, create the new article object using form below and submit to container handleArticlePost function
  function handleSubmit(event){
    event.preventDefault();
    const newArticle = {
      "headline": event.target.headline.value,
      "summary": event.target.summary.value,
      "fullstory": event.target.fullstory.value,
      "dateCreated": event.target.date.value,
      "image": event.target.image.value,
      "readCount": 0,
      "category": event.target.category.value,
      "journalist": event.target.journalist.value
    }
    props.handleArticlePost(newArticle);

  }

    //retrieve categories from props and store dropdown options in variable
    const categories = props.categories.map((category, index) => {
      return <option key={index} value={category._links.self.href}>{category.name}</option>
    })

    //retrieve journalists from props and store dropdown options in variable
    const journalists = props.journalists.map((journalist, index) => {
      return <option key={index} value={journalist._links.self.href}>{journalist.firstName} {journalist.surname}</option>
    })

    //render form
    return (
      <div className='article-create-form'>
        <form onSubmit={handleSubmit}>

          <label for="journalist">Journalist:</label>
          <select id='journalist' name="journalist" >
            {journalists}
          </select>
          <Link to = "/journalists/new">New Journalist?</Link>
        <br></br>
          <label for="date">Article Date:</label>
          <input type="date" id='date' name="dateCreated"/>
          <br></br>
          <label for="headline">Headline:</label>
          <input type="text" id='headline' name="headline"/>
          <br></br>
          <label for="summary">Summary:</label>
          <input type="text" id='summary' name="summary"/>
          <br></br>
          <label for="image">Image path:</label>
          <input type="text" id='image' name="image"/>
          <br></br>
          <label for="fullstory">Full Story:</label>
          <textarea name="fullstory" id='fullstory' wrap="hard" rows="10" cols="50"></textarea>
          <br></br>
          <label for="category">Category:</label>
          <select id='category' name="category">
            {categories}
          </select>
          <br></br>
          <button type="submit">Save Article</button>
        </form>
      </div>
    )
  }



export default ArticleCreateForm;
