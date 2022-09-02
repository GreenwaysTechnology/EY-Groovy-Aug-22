import com.ey.fp.closures.dynamicprog.delegates.Math
import com.ey.fp.closures.dynamicprog.delegates.Util

//Util Object "add" closure can be attached to Math Object

def math = new Math(a: 10, b: 20)
def util = new Util();
util.add.delegate = math
print util.add()