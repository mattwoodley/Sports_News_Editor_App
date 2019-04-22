import React from 'react';
import {Link} from 'react-router-dom';
import MicroJournalist from '../journalists/MicroJournalist';

//stateless component, curly brackets requirement of using return
const ArticleDetails = (props) => {

//declare these two to be used in the buttons below, we link the button to the variable to the props function eventually leading to the scope of Single Article Container
  const onDelete = () => {
    props.handleDelete(props.id);
  }

  const onEdit = () => {
    props.handleEdit(props.id)
  }

//if nothing is passed down return null
  if(!props.article && !props.journalist){
    return null;
  }


//render the article using the details passed down in props. Note the re-use of MicroJournalist. Starting to get the vibe that this is what react is about.

  return (
    <React.Fragment>
      <h2 className='article-headline'>{props.article.headline}</h2>
      <p className='article-summary'>{props.article.summary}</p>
      <p classname='article-full-story'>{props.article.fullStory}</p>
        <Link to = {"/journalists/" + props.journalist.id} className="article-microjournalist-link">
          <MicroJournalist journalist={props.journalist}/>
        </Link>
      <p classname='article-date-created'>{props.article.dateCreated}</p>
      <button className='admin-button' type='button' onClick={onEdit}>Edit this Article</button>
      <button className='admin-button' type='button' onClick={onDelete}>Delete this Article</button>
    </React.Fragment>
  )

}
 export default ArticleDetails;
