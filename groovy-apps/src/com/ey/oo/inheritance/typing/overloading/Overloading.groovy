import com.ey.oo.inheritance.typing.overloading.Calculator
import com.ey.oo.inheritance.typing.overloading.Person

def calc = new Calculator()
println(calc.add(1, 2))
println(calc.add(1, 2, 3))

//constructor overload
def person = new Person(id: 1, name: 'Subramanian')
person = new Person(id: 1)
person = new Person(name: 'Subramanian')