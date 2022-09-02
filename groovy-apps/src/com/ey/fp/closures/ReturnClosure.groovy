//method which returns closure
//syntax -1
def counter() {
    //inner closure
    def inc = {
        10
    }
    return inc
}

def increment = counter()
println increment()

//
//method which returns closure
//syntax -2
def counter2() {
    //Anonmous closure
    return {
        10
    }
}

def increment2 = counter2()
println increment2()

//
//method which returns closure without return statement
//syntax -3
def counter3() {
    def inc = {
        10
    }
}

def increment3 = counter3()
println increment3()
/////////////////////////

//closure returns another closure
def auth = {
    return {
        "Login Success"
    }
}
def status = auth()
println status()













