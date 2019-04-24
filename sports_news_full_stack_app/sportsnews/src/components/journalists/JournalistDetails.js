import React from 'react';
import ArticleList from '../articles/ArticleList';
import MicroJournalist from './MicroJournalist';
import {Link} from 'react-router-dom';


const JournalistDetails = (props) => {

  //declare these two to be used in the buttons below, we link the button to the variable to the props function eventually leading to the scope of Single Article Container
  const onDelete = () => {
    props.handleDelete(props.id);
  }

  const onEdit = () => {
    props.handleEdit(props.id)
  }

  //if nothing is passed down return null
  if(!props.journalist){
    return null;
  }

//in the odd case that a journalist has produced no articles

  if(!props.journalist._embedded){
    return (
      <React.Fragment>
        <MicroJournalist journalist={props.journalist}/>
        <button className='admin-button' type='button' onClick={onEdit}>Edit Journalist</button>
        <button className='admin-button' type='button' onClick={onDelete}>Delete Journalist</button>
      </React.Fragment>
    )
  }


  //render the article using the details passed down in props. Note the re-use of MicroJournalist. Starting to get the vibe that this is what react is about.

  return (
    <React.Fragment>
      <MicroJournalist journalist={props.journalist}/>
      <button className='admin-button' type='button' onClick={onEdit}>Edit Journalist</button>
      <button className='admin-button' type='button' onClick={onDelete}>Delete Journalist</button>
      <ArticleList articles = {props.journalist._embedded.articles} />;
    </React.Fragment>
  )

}

export default JournalistDetails;
