//Higher order functions : Passing function as parameter to another function/method/closure

//normal methods
//Here type is String
//name is variable
//"Subramanian" is value
def sayGreet(String name) {
    println "Name is $name"
}
//parameters can be hardcoded
//parameters can be variables
def name = "Subramanian" //
sayGreet(name)
sayGreet("Subramanian")

//higher order function
def connect(callback) {
    //call method/function/closure
    callback()
}
//pass function as parameter
def webServer = {
    println "WebServer starts"
}
connect(webServer)
//inline closure passing: anonymous functions/closures
connect({
    println "WebServer starts Again!!!"
})




