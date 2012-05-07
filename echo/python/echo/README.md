# echo

Web service written in python that parses and echoes JSON data.

## Usage

Activate the virtualenv:

    virtualenv env
    . env/bin/activate

Download a WSGI server:

    ./env/bin/easy_install gunicorn

Run the service

    ./env/bin/gunicorn -b 127.0.0.1:3000 app:app

Call the service from curl:

    curl -i "http://127.0.0.1:3000" -d '{"foo":"bar"}'

## License

Copyright (C) 2012 Anthony Eden 

Distributed under the MIT License.
