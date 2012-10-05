import groovy.json.JsonBuilder

def output = new JsonBuilder()
def map = [ fullName: 'Test User' ]
output.user map
response.contentType = "text/html"
print """\
<html>
<head><title>Groovy/App Engine Bug</title>
<body>"""
try {
	print "<h1>Error Free :)</h1><pre>${output.toString()}</pre>"	
} catch (Throwable t) {
	def stacktrace = new StringWriter()
	def errWriter = new PrintWriter(stacktrace)
    t.printStackTrace(errWriter)
	print "<h1>${t.toString()}</h1><pre>${stacktrace}</pre>"
}
print """\
</body>
</html>
"""