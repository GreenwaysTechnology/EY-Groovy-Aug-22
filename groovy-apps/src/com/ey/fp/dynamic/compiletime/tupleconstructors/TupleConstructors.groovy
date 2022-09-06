import com.ey.fp.dynamic.compiletime.tupleconstructors.Person

//traditional map -style constructor
def person = new Person(id: 1, name: 'Subramanian', city: 'Coimbatore')
println(person)

//tuple constructor
def newPerson = new Person(1, "Subramanian", "Cbe")
println(newPerson)

newPerson = new Person(34)
println(newPerson)