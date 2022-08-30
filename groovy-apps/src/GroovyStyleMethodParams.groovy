//
def sayHello(def name, def message) {
    println "$message $name"
}

sayHello("Subramanian", "Hello")
sayHello(45, "Hello")
//sayHello()
sayHello(null, null)

//skipping def key word is also valid
def calculate(a, b) {
    def c = a + b
    println("Result is $c")
}

calculate(1, 3)
//calculate()
//calculate(true,false)

//you can skip params.
////default args:if there is no parameter , default value can be assigned
//def sayGreet(name = "default") {
//    println("Your Name is ${name.toUpperCase()}")
//}

def sayGreet(String name = "default") {
    println("Your Name is ${name.toUpperCase()}")
}

sayGreet();
sayGreet("Ram")

def multiply(a = 0, b = 0) {
    return a * b
}

println(multiply())
println(multiply(2,89))