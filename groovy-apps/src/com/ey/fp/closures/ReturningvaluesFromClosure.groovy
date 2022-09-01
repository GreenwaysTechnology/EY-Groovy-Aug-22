//returning values from the closure

def add = null

//Explicit return statement
add = { a = 1, b = 1 ->
    def res = a + b
    return res;
}
println add(10, 10)
//No need of explicit return keyword
add = { a = 1, b = 1 ->
    def res = a + b
    res;
}
println add(10, 10)
//always last line of code considered return value
add = { a = 1, b = 1 ->
    def res = a + b
    // res;
}
println add(10, 10)
//No need of computing and storing in a variable
add = { a = 1, b = 1 ->
    a + b //Expression return
}
println add(10, 10)
//////
//Return single arg
def getName = null;
getName = { name -> return name }
println getName("Subramanian")

//with it keyword
getName = { it }
println getName("Subramanian")

getName = { "Hello ${it}" }
println getName("Subramanian")

getName = { "Hello $it" }
println getName("Subramanian")



