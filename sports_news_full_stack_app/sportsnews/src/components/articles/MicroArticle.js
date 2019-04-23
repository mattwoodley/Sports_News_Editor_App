import React from 'react';
import {Link} from 'react-router-dom';

//MicroArticle is a small preview of each article which will appear in the articleList, JournalistDetail and CategoriesList
//note the use of fragment to avoid creating a dom node - each microarticle is contained within the parent li or div element - this will allow for different layouts of the same component

const MicroArticle = (props) => {
  return(
    <React.Fragment>
      <Link to = {"/articles/" + props.id} className="microarticle-img-link">
        <img src={props.image}/>
      </Link>
      <h4 className='microarticleHeadline'>{props.headline}</h4>
      <p className='microarticleSummary'>{props.summary}</p>
      <p className='microarticlecategory'>{props.category.name}</p>
      <p className='microarticledate'>{props.dateCreated}</p>
</React.Fragment>
);
}

export default MicroArticle;
