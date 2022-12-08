# HTTP
Hyper Text Transfer Protocol (http) is the most popular way of transferring information online. It is a request/response system that guarantees a response for every request made.

request components
- uri
    -this is part of the request that tells the web server what information that you want.
- body
    - many requests conatin a body. this is information that is neede to complete a request.
- verb
    - the verb shows what you are trying to accomplish
        - get: requester wants to get info
        - post: requester wants to create or provide info in an app
        - put: requester wants to update all of a resource handled by app
        - parch: requester wants to update some of a resource handled by app
        - delete: requester wants to delete some resource handled by app

response components
- body
    - contatins information requested.
- status code
    - this is a number that shows how request was handled
    - 100 informational
    - 200 success
    - 300 redirect
    - 400 user error (clientside error)
    - 500 server error (dev messed up: bad thing)