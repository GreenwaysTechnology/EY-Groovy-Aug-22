import com.ey.fp.closures.dynamicprog.delegates.Person
import com.ey.fp.closures.dynamicprog.delegates.Visitor

//Greeter cls

def greeter = {
    println "This ${this}"
    println "Owner ${owner}"
    println "Delegate ${delegate}"
    println delegate.name // some object property
}
//greeter()
def person = new Person(name: 'Subramanian');
def visitor = new Visitor(name: 'Ram')

//change the relationship: change the owner

greeter.delegate = person
greeter()

//again the change owner
greeter.delegate = visitor
greeter()