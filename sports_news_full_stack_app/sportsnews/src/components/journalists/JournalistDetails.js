import React from 'react';
import MicroArticle from '../articles/MicroArticle';
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
    if(!props.articles && !props.journalist){
      return null;
    }


  //render the article using the details passed down in props. Note the re-use of MicroJournalist. Starting to get the vibe that this is what react is about.

    return (
      <React.Fragment>
        <h2 className='journalist-image'>{props.journalist.headline}</h2>
        <p className='journalist-firstName'>{props.journalist.firstName}</p>
        <p classname='journalist-surname'>{props.journalist.surname}</p>
          <Link to = {"/journalists/" + props.journalist.id} className="article-microjournalist-link">
            <MicroJournalist journalist={props.journalist}/>
          </Link>
        <button className='admin-button' type='button' onClick={onEdit}>Edit Journalist</button>
        <button className='admin-button' type='button' onClick={onDelete}>Delete this ArticleJournalist</button>
      </React.Fragment>
    )

}

export default JournalistDetails;
