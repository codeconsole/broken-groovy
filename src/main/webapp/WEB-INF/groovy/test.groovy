import groovy.json.JsonBuilder

response.contentType = 'application/json'
def output = new JsonBuilder()
def map = [ fullName: 'Test User' ]
output.user map
println output.toString()