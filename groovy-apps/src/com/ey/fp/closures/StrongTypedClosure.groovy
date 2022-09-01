//Typed closure
//Closure is generic type
Closure<Boolean> isOdd = {
    it % 2 != 0
}
println isOdd(10)? "Odd" : "Even"