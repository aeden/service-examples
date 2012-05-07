# echo

Web service written in ruby that parses and echoes JSON data.

## Usage

Install bundler

    gem install bundler

Download required dependencies:

    bundle install

Run the service

    rackup

Call the service from curl:

    curl -i "http://127.0.0.1:3000" -d '{"foo":"bar"}'

## License

Copyright (C) 2012 Anthony Eden 

Distributed under the MIT License.
