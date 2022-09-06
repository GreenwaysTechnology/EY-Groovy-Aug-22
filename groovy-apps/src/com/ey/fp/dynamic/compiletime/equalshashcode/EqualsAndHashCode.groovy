import com.ey.fp.dynamic.compiletime.equalshashcode.Person

def personOne = new Person(id: 1, name: 'Subramanian', city: 'Coimbatore')
//def personTwo = new Person(id: 1, name: 'Ram', city: 'Coimbatore')
def personTwo = new Person(id: 1, name: 'Subramanian', city: 'Coimbatore')

println(personOne == personTwo ? "Two Person Objects are same" : "Two Person Objects are not same")

println(personOne.equals(personTwo) ? "Two Person Objects are same" : "Two Person Objects are not same")