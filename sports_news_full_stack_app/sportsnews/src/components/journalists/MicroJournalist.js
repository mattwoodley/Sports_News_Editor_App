import React from 'react';
import {Link} from 'react-router-dom';

//MicroJournalist is a small preview of each journalist which will appear in the JournalistList, ArticletDetail and CategoriesList
//note the use of fragment to avoid creating a dom node - each microarticle is contained within the parent li or div element - this will allow for different layouts of the same component

const MicroJournalist= (props) => {
  return(<React.Fragment>
    <Link to = {"/journalists/" + props.journalist.id} className="microjournalist-img-link">
          <img src={props.journalist.image}/>
        </Link>
        <p className='microjournalistFirstName'>{props.journalist.firstName}</p>
        <p className='microjournalistSurname'>{props.journalist.surname}</p>
  </React.Fragment>
)
}

export default MicroJournalist;
