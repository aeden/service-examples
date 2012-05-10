# docstore

Web service for storing a JSON document

## Usage

Install leiningen:

    brew install leiningen

Download required dependencies:

    lein deps

Run the service:

    lein exec bin/server.clj

Call the service from curl:

    curl -i "http://127.0.0.1:3000/a-document-name -d '{"foo":"bar"}'

## License

Copyright (C) 2012 Anthony Eden 

Distributed under the MIT License.
