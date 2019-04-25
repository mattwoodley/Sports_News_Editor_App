import React from 'react';
//stateless component
const JournalistCreateForm = (props) => {

    //stop the page refreshing, create the new article object using form below and submit to container handleArticlePost function
    function handleSubmit(event){
      event.preventDefault();
      const newJournalist = {
        "firstName": event.target.firstName.value,
        "surname": event.target.surname.value,
        "image": event.target.image.value
      }
      props.handleJournalistPost(newJournalist);

    }


      //render form
      return (
        <div className='journalist-create-form'>
          <form onSubmit={handleSubmit}>

            <label for="firstName">First Name:</label>
            <input type="text" id='firstName' name="firstName"/>
            <br></br>
            <label for="surname">Last Name:</label>
            <input type="text" id='surname' name="surname"/>
            <br></br>
            <label for="image">Image path:</label>
            <input type="text" id='image' name="image"/>
            <br></br>
            <button type="submit">Save Journalist</button>
          </form>
        </div>
      )
}

export default JournalistCreateForm;
