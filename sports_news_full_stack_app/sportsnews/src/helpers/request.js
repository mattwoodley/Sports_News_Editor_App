class Request {

//get all data from database - note that you'll need to use routing to determine sort criteria. Configure in router.
  get(url) {
    return fetch(url)
    .then((res) => res.json());
  }

//creates a new record
  post(url, payload){
    return fetch(url, {
      method: "POST",
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(payload)
    })
  }

// deletes a record
  delete(url) {
    return fetch(url, {
      method: "DELETE",
      headers: {'Content-Type': 'application/json'}
    })
  }

// patch is when you're updating a record
  patch(url, payload){
    return fetch(url, {
      method: "PATCH",
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(payload)
    })
  }

}

export default Request;
