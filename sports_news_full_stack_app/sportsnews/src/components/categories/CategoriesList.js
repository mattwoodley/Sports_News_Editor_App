import React from 'react';
import MicroArticle from '../articles/MicroArticle.js';
import CategoriesNavBar from './CategoriesNavBar.js';

//CategoriesListContainer renders CategoriesList. CategoriesList responsible for rendering an ul of MicroArticle elements - list format to be used for CSS styling.
//articles once retrieved from api collection mapped to useful react component

const CategoriesList = (props) => {

  const articles = props.articles.map((article,index) => {
    return (
      <li key={article.id} className="microarticle-li">
        <MicroArticle article = {article}/>
      </li>
    );
  });


	return (
    <React.Fragment>
    <CategoriesNavBar categories={props.articles}/>
  		<ul className="microarticle-ul">
        {articles}
  	  </ul>

    </React.Fragment>
	)
}

export default CategoriesList;
