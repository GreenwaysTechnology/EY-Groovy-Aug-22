
def a = 10
def b = 50
//compare and say some result
if (a == b) {
    println("A and B are equal")
} else {
    println("A and B are not equal")
}
//tenary operator
(a == b) ? println("A and B are equal") : println("A and B are not equal")
def res = (a == b) ? "A and B are equal " : "A and B are not equal"
println(res)

//tenary with other booleans

def name = "Subramaian";
def response = name ? "Hello $name" : "Hello!"
println(response)
