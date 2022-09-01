//closure can take args and parameters
//args are separed with body using "-> arrow"
def add;
add = { int a, int b ->
    //body of the function
    def result = a + b
    println "The Result $result"
}
//passing parameters
add(10, 10)

//can i skip parameters
add = { int a = 0, int b = 0 ->
    //body of the function
    def result = a + b
    println "The Result $result"
}
//
add()
//can i have dynamic typed variables
add = { def a = 0, def b = 0 ->
    //body of the function
    def result = a + b
    println "The Result $result"
}
//
add()
//add(true,89)

//even we can skip def/type
add = { a = 0, b = 0 ->
    //body of the function
    def result = a + b
    println "The Result $result"
}
add(10, 10)
