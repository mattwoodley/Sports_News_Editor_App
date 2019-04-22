import React from 'react';
import MicroJournalist from './MicroJournalist.js';


const JournalistList = (props) => {
  const journalists = props.journalists.map((journalist,index) => {
		 	return (
				<li key={index} className="microjournalist-li">
					<div className = "micro-journalist">
				<MicroJournalist id={index} firstName={journalist.firstName} surname={journalist.surname} image={journalist.image}/>
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
