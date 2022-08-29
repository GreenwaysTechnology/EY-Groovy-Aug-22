println "............................."
def name = "Subramanian";
def greeting = 'Hello ' + name;
println greeting;
println greeting instanceof java.lang.String;
//
def firstName="Subramanian";
def lastName = "Murugan"
println("Name " + firstName + lastName)

//here message type is groovy.GString not java.lang.String
def message = "Hello ${name}" // string interpolation
println(message)
message = "Hello $name"
println(message)

def host = "ey.com"
def port = 8080
def url = "/api"
def path = "/pipelines"

//def uri = "http://${host}:${port}${url}${path}";
def uri = "http://$host:$port$url$path";

println(uri)