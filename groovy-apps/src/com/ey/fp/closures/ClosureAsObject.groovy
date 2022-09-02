

def sayGreet = {
    println "Hello"
}
println (sayGreet instanceof Closure)
//calling closure with call method
sayGreet.call()
//short cut
sayGreet()
