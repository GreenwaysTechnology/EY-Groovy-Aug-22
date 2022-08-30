def name = ""; //empty string is falsy value
def city = "Coimbatore" //string truthy

def result = name && city  //false
println(result)

def start = 0; //0 false
def stop = 10; //10 true
println start || stop; // true

def isEmpty; //null - falsy
println isEmpty;
println !isEmpty
isEmpty = "hello"
println !isEmpty