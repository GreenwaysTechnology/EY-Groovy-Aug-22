//Elvis Operator

def a = 0;
//assign default value if a is false
def counter; //null
//if counter is false,then initalize 1 else the value of the counter
println counter ?: 1;
println a ?: 100
a = 90;
println a ?: 100

def price;
//Using tenary
println price ? price : 10;
//Using elivs
println price ?: 10

//price = 900
def tmpPrice = (price ?: 10) * 2
//def totalPrice = tmpPrice * 100
println "Total Price $tmpPrice"
