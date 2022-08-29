// instanceof operator is used to verify the variable that it belongs to particular type or not
//instanceof operator works only with "Reference" types(Object types) not with primitives.

//primitives
int a = 10
//Cannot perform instanceof check against primitive type int
//println(a instanceof  int)
String name = "Subramanian"
println(name instanceof String)

//dynamic typed : groovy assigns the type of variable not primitive but object type
//Wrapper types: every primitive types has eq wrapper types
//Wrappers - whole numbers
/**
 * byte  -  Byte
 * short - Short
 * int - Integer
 * long - Long
 */

def b = 90
println("B's type Byte or not " + (b instanceof Byte))
println("B's type Short or not " + (b instanceof Short))
println("B's type Integer or not " + (b instanceof Integer))
println("B's type Long or not " + (b instanceof Long))

def d = 1298834343434
println("D's type Byte or not " + (d instanceof Byte))
println("D's type Short or not " + (d instanceof Short))
println("D's type Integer or not " + (d instanceof Integer))
println("D's type Long or not " + (d instanceof Long))
//How groovy understands the variable type automatically
//based on value length
//How value length is understand  - Integer.MAX_VALUE + 1 => Long

def lightSpeed=2232333333333333333333333333333333333331212121212092347329473433483473984732948734983473984739473498473289472394238437498479487948749387492479479347943794479;
println("lightSpeed's type Byte or not " + (lightSpeed instanceof Byte))
println("lightSpeed's type Short or not " + (lightSpeed  instanceof Short))
println("lightSpeed's type Integer or not " + (lightSpeed instanceof Integer))
println("lightSpeed's type Long or not " + (lightSpeed instanceof Long))
println("lightSpeed's type BigInteger or not " + (lightSpeed instanceof BigInteger))