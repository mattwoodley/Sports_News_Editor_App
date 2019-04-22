import React from 'react';
import MicroJournalist from './MicroJournalist.js';

//JournalistListContainer renders JournalistList -  responsible for rendering  an ul of microjournalist elements - list format to be used for CSS styling.
//journalists once retrieved from api collection mapped to useful react component

const JournalistList = (props) => {
  const journalists = props.journalists.map((journalist,index) => {
		 	return (
				<li key={index} className="microjournalist-li">
					<div className = "micro-journalist">
				<MicroJournalist id={index+1} firstName={journalist.firstName} surname={journalist.surname} image={journalist.image}/>
			</div>
			</li>
		)
		})

	return (
		<ul className="microjournalists-ul">
	    {journalists}
	  </ul>

	)
}

export default JournalistList;
