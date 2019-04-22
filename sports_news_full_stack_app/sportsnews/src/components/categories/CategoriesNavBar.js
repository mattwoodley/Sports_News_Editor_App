import React, {Link} from 'react';

//CategoriesNavBar is used within CategoriesList.
//CategoriesNavBar returns all categories within a <nav> with the className categoriesNavButton so that it can be used in CSS.

const CategoriesNavBar = (props) => {
  const categories = props.categories.map((category,index) => {
    return (
      <Link className='categoriesNavButton' to={'/categories/' + categories.id}>{categories.name}</Link>
    )
  })

  return (
    <nav className="categories-nav">
      {categories}
    </nav>
  )
}

export default CategoriesNavBar;
