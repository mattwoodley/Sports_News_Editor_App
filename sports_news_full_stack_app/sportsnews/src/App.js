import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import MainContainer from './containers/MainContainer';
import NavBar from './containers/NavBar';
import Header from './containers/Header';
import ArticleListContainer from './containers/articles/ArticleListContainer'
import SingleArticleContainer from './containers/articles/SingleArticleContainer';
import ArticleCreateFormContainer from './containers/articles/ArticleCreateFormContainer';
import ArticleEditFormContainer from './containers/articles/ArticleEditFormContainer';
import JournalistListContainer from './containers/journalists/JournalistListContainer'
import SingleJournalistContainer from './containers/journalists/SingleJournalistContainer';
import JournalistCreateFormContainer from './containers/journalists/JournalistCreateFormContainer';
import JournalistEditFormContainer from './containers/journalists/JournalistEditFormContainer';
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
            <Route exact path = '/articles/new' component={ArticleCreateFormContainer}/>
            <Route exact path = '/articles/edit/:id' render = {(props) =>{
              const id = props.match.params.id;
              return <ArticleEditFormContainer id = {id} />
            }}
            />
            <Route exact path = '/articles/:id' render = {(props) =>{
              const id = props.match.params.id;
              return <SingleArticleContainer id = {id} />
            }}
            />
            <Route exact path = '/journalists' component={JournalistListContainer}/>
            <Route exact path = '/journalists/new' component={JournalistCreateFormContainer}/>
            <Route exact path = '/journalists/edit/:id' render = {(props) =>{
              const id = props.match.params.id;
              return <JournalistEditFormContainer id = {id} />
            }}
            />
            <Route exact path = '/journalists/:id' render = {(props) =>{
              const id = props.match.params.id;
              return <SingleJournalistContainer id = {id} />
            }}
            />
            <Route exact path = '/categories/:id' render = {(props) =>{
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
