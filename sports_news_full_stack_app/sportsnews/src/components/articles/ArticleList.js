import React from 'react';
import MicroArticle from './MicroArticle.js';

//Article container renders article list - article list responsible for rendering  an ul of microarticle elements - list format to be used for CSS styling.
//articles once retrieved from api collection mapped to useful react component

const ArticleList = (props) => {
  if(!props.articles){
    return null;
  }
  const articles = props.articles.map((article,index) => {
		 	return (
				<li key={index} className="microarticle-li">
					<div className = "micro-article">
				<MicroArticle article={article}/>
			</div>
			</li>
		)
		})

	return (
		<ul className="microarticle-ul">
	    {articles}
	  </ul>

	)
}

export default ArticleList;
