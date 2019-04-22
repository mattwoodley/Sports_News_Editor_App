import React from 'react';
import {Link} from 'react-router-dom';

//MicroJournalist is a small preview of each journalist which will appear in the JournalistList, ArticletDetail and CategoriesList
//note the use of fragment to avoid creating a dom node - each microarticle is contained within the parent li or div element - this will allow for different layouts of the same component

const MicroJournalist= (props) => {
  <React.Fragment>
    <Link to = {"/journalists/" + props.id} className="microjournalist-img-link">
          <img src={props.image}/>
        </Link>
        <p className='microjournalistFirstName'>{props.firstName}</p>
        <p className='microjournalistSurname'>{props.surname}</p>
  </React.Fragment>
}

export default MicroJournalist;
