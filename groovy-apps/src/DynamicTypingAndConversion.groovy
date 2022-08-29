//here by default type is Integer
def myvar = 100;
println myvar instanceof Integer /// int
//What if i want to convert into Short, i want to represent in side short/long/byte
def myvar2 = 100 as Short;
println myvar2 instanceof Integer /// int
println myvar2 instanceof Short /// int

def a = 100  // here 100 is primitive(int)  a is Integer  Integer a = 100
int b = a;  // b is int a is Integer  int b = Integer b
println("a " + a + " b" + b)