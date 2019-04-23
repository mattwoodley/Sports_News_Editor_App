import React from 'react';
import {Link} from 'react-router-dom';


//MicroArticle is a small preview of each article which will appear in the articleList, JournalistDetail and CategoriesList
//note the use of fragment to avoid creating a dom node - each microarticle is contained within the parent li or div element - this will allow for different layouts of the same component

const MicroArticle = (props) => {
return(
<React.Fragment>
  <div className='microjournalist'>
  <Link to = {"/articles/" + props.article.id} className="microarticle-img-link">
        <img src={props.article.image}/>
      <h4 className='microatricleHeadline'>{props.article.headline}</h4>
      <p className='microarticleSummary'>{props.article.summary}</p>
      </Link>
      <p className='microarticlecategory'>{props.article.category.name}</p>
      <p className='microarticledate'>{props.article.dateCreated}</p>
    </div>
</React.Fragment>
);
}

export default MicroArticle;
