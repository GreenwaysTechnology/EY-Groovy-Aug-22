//List

def numbers = [1, 2, 3, 4, 5, 9]
def value = numbers.get(1)
println(value)
//how to read all value : for loop  , provide iterators are api to read values
numbers.forEach(i -> println(i)) // functional programming is used ; java style
numbers.each { i -> println(i) }
numbers.each { println(it) }

println "...................................."
//set
def employees = [10, 10, 20, 30, 40, 50] as HashSet
//def employees = [10, 10, 20, 30, 40, 50] as HashSet

employees.each {println(it)}