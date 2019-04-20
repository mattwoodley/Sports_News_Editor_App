import React from 'react';
import {Link} from 'react-router-dom';


const MicroArticle = (props) => {
return(
<React.Fragment>
  <Link to = {"/articles/" + props.id} className="microarticle-img-link">
        <img src={props.image}/>
      </Link>
      <h4 className='microatricleHeadline'>{props.headline}</h4>
      <p className='microarticleSummary'>{props.summary}</p>
      <p className='microarticledate'>{props.dateCreated}</p>
</React.Fragment>
);
}

export default MicroArticle;
