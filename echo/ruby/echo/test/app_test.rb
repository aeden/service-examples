require 'rack'
require 'minitest/spec'
require 'minitest/autorun'
require 'app'

describe App do
  let(:env) { Rack::MockRequest.env_for('/', {"rack.input" => StringIO.new('{"foo":"bar"}')}) } 
  it 'returns the JSON string' do
    status, headers, body = App.call(env)
    status.must_equal 200
    headers.must_equal({'Content-Type' => 'application/json'})
    body.must_equal(["{\"foo\":\"bar\"}"])
  end
end
