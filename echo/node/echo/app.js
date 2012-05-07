var http = require('http');

http.createServer(function (request, response) {
  var data = '';
  request.addListener('data', function(chunk) { data += chunk; });
  request.addListener('end', function() {
    response.writeHead(200, {'Content-Type': 'application/json'});
    response.end(JSON.stringify(JSON.parse(data)));
  });
}).listen(3000);

console.log('Server running at http://127.0.0.1:3000/');
