//Args and params

//name,message are args
void sayWelcome(String name, String message) {
    println("$message $name")
}

sayWelcome("Subramanian", "Hello")
//sayWelcome("ram",78) //wrong types are passed

//return value,return expression
int add(int a, int b) {
    int c = a + b
    return c //return variable
}

println(add(10, 90))

//how to return expression
int div(int a, int b) {
        return a / b
}
println(div(10,2))

//biz logic with
boolean  login(String name,String password){
    if(name=='admin' && password=='admin'){
        return true
    }
    return false
}
println(login("admin","admin") ? "Login Success" : "Login Failed")

