import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import './App.css';
import MainContainer from './containers/MainContainer';
import NavBar from './containers/NavBar';
import Header from './containers/Header';
import ArticleListContainer from './containers/articles/ArticleListContainer'
import SingleArticleContainer from './containers/articles/SingleArticleContainer';
import ArticleFormContainer from './containers/articles/ArticleFormContainer';
import ArticleEditFormContainer from './containers/articles/ArticleEditFormContainer';
import JournalistListContainer from './containers/articles/JournalistListContainer'
import SingleJournalistContainer from './containers/articles/SingleJournalistContainer';
import JournalistFormContainer from './containers/articles/JournalistFormContainer';
import JournalistEditFormContainer from './containers/articles/JournalistEditFormContainer';
import CategoriesListContainer from './containers/categories/CategoriesListContainer'



class App extends Component {
  render() {
    return (
      <Router >
        <React.Fragment>
          <Header/>
          <NavBar/>
          <Switch>
            <Route exact path = '/' component={MainContainer}/>
            <Route exact path = '/articles' component={ArticleListContainer}/>
            <Route exact path = '/articles/new' component={ArticleFormContainer}/>
            <Route exact path="/articles/edit/:id" render = {(props) =>{
              const id = props.match.params.id;
              return <ArticleEditFormContainer id = {id} />
            }}
          />
          <Route exact path="/articles/:id" render = {(props) =>{
            const id = props.match.params.id;
            return <SingleArticleContainer id = {id} />
          }}
        />
        <Route exact path = '/articles' component={JournalistListContainer}/>
        <Route exact path = '/articles/new' component={JournalistFormContainer}/>
        <Route exact path="/articles/edit/:id" render = {(props) =>{
          const id = props.match.params.id;
          return <JournalistEditFormContainer id = {id} />
        }}
      />
      <Route exact path="/articles/:id" render = {(props) =>{
        const id = props.match.params.id;
        return <SingleJournalistContainer id = {id} />
      }}
      <Route exact path="/categories/:id" render = {(props) =>{
        const id = props.match.params.id;
        return <CategoriesListContainer id = {id} />
      }}
    />
  </Switch>
</React.Fragment>
</Router>
);
}
}

export default App;
