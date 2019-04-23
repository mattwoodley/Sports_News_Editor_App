import React from 'react';
import MicroArticle from '../articles/MicroArticle.js';
import CategoriesNavBar from './CategoriesNavBar.js';

//CategoriesListContainer renders CategoriesList. CategoriesList responsible for rendering an ul of MicroArticle elements - list format to be used for CSS styling.
//articles once retrieved from api collection mapped to useful react component

const CategoriesList = (props) => {

  const categories = props.articles.map((category,index) => {
    return (category);
  });

  const articles = categories.map((article, index) => {
    return (
      console.log(article),
      article
    );
  });

	return (
    <React.Fragment>
    <CategoriesNavBar categories={props.articles}/>
  		<ul className="microarticle-ul">
        <li key={articles.id} className="microarticle-li">
          <div className = "micro-article">
            <MicroArticle
              id={articles.id}
              headline={articles.headline}
              summary={articles.summary}
              image={articles.image}
              dateCreated={articles.dateCreated}
            />
          </div>
        </li>
  	  </ul>

    </React.Fragment>
	)
}

export default CategoriesList;
