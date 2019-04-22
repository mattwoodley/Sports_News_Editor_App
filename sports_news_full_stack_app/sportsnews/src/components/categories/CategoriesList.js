import React from 'react';
import MicroArticle from '../articles/MicroArticle.js';
import CategoriesNavBar from './CategoriesNavBar.js';

//CategoriesListContainer renders CategoriesList. CategoriesList responsible for rendering an ul of MicroArticle elements - list format to be used for CSS styling.
//articles once retrieved from api collection mapped to useful react component

const CategoriesList = (props) => {
  console.log(props);
  console.log(props.articles);

  const categoryArticles = props.articles.map((article,index) => {
		 	return (
				<li key={index} className="microarticle-li">
					<div className = "micro-article">
    				<MicroArticle
              id={article.id}
              headline={article.headline}
              summary={article.summary}
              image={article.image}
              dateCreated={article.dateCreated}
            />
    			</div>
  			</li>
		)
	})

	return (
    <React.Fragment>
    <CategoriesNavBar categories={props.articles}/>
  		<ul className="microarticle-ul">
        {categoryArticles}
  	  </ul>
    </React.Fragment>
	)
}

export default CategoriesList;
