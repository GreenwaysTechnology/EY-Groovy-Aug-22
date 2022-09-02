import com.ey.fp.closures.dynamicprog.delegates.Person

/**
 * Whenever, in a closure a property is accessed without explicitly setting a receiver object,
 * then a delegation strategy is involved
 */

//def name = "Subramanian";

def upperCasedName = {
    println "this : ${this}"
    println "Owner : ${owner}"
    println "Delegate : ${delegate}"
    println("${name.toUpperCase()}")
}
//upperCasedName()

def person = new Person(name: 'Geetha')
upperCasedName.resolveStrategy = Closure.OWNER_FIRST
upperCasedName.delegate = person
upperCasedName()
