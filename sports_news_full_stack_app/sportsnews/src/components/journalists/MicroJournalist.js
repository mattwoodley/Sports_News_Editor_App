import React from 'react';
import {Link} from 'react-router-dom';

//MicroJournalist is a small preview of each journalist which will appear in the JournalistList, ArticletDetail and CategoriesList
//note the use of fragment to avoid creating a dom node - each microarticle is contained within the parent li or div element - this will allow for different layouts of the same component

const MicroJournalist= (props) => {
  return(<React.Fragment>
    <div className='microjournalist'>
    <Link to = {"/journalists/" + props.journalist.id} className="microjournalist-img-link">
          <img src={props.journalist.image}/>
        </Link>
        <p className='microjournalist-full-name'>{props.journalist.firstName} {props.journalist.surname}</p>
      </div>
  </React.Fragment>
)
}

export default MicroJournalist;
