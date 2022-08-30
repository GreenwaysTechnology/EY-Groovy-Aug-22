//type methodName(){ return }
//def methodName(){return}

String sayHello() {
    return "Hello"
}

println(sayHello())

//in groovy we dont need to use return statement to return value, last line of code is considered
//return value
//noreturn value means, default is null
//by default groovy method always return
void sayHai() {
    println("Hai")
}
//def sayHai(){
//    println("Hai")
//}
def hai = sayHai();
println hai
//return something

def add(int a = 0, int b = 0) {
    //return a + b // old/java style of returning value
    println("Adder method is called ")
    a + b
}

def addResult = add(1, 8)
println("Result is ${addResult}")

def getFullName() {
    def firstName = "Subramanian"
    def lastName = "Murugan"
    def fullName = "$firstName $lastName"
}

println(getFullName())

def login(userName = "", password = "") {
    (userName == "admin") && (password == 'admin')
}

login("admin", "admin") ? println("login is success") : println("Login is failed")

//get the value and return the same
def getStockPrice(stock) { stock }
println(getStockPrice(200))