require 'yajl'

App = lambda { |env| 
  [
    200, 
    {"Content-Type" => "application/json"}, 
    [Yajl::Encoder.encode(Yajl::Parser.parse(env['rack.input']))]
  ]
}
