import React from 'react';
import MicroArticle from './MicroArticle.js';

//Article container renders article list - article list responsible for rendering  an ul of microarticle elements - list format to be used for CSS styling.
//articles once retrieved from api collection mapped to useful react component

const ArticleList = (props) => {
  const articles = props.articles.map((article) => {
		 	return (
				<li key={article.id} className="microarticle-li">
					<div className = "micro-article">
				<MicroArticle headline={article.headline} summary={article.summary} image={article.image} dateCreated={article.dateCreated} />
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
