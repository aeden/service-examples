import json

def app(env, start_response):
  start_response('200 OK', [('Content-Type', 'application/json')])
  return [json.dumps(json.loads(env['wsgi.input'].read(int(env.get('CONTENT_LENGTH')))))]
