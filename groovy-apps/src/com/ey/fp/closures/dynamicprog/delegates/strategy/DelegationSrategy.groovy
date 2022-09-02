import com.ey.fp.closures.dynamicprog.delegates.strategy.Person
import com.ey.fp.closures.dynamicprog.delegates.strategy.Visitor

def p = new Person(name: 'Subramanian')
//def p = new Person()

def v = new Visitor(name: 'Arun')
//def v = new Visitor()
//the delegate object is used first, then owner
//p.print.resolveStrategy = Closure.DELEGATE_FIRST
//default : if property/method exits in the owner, then it will be called on the owner if not
// then delegate is used.
//p.print.resolveStrategy = Closure.OWNER_FIRST

//will only resolve the property/method lookup on the owner; the delegate will be ignored
//p.print.resolveStrategy = Closure.OWNER_ONLY

//will only resolve the property/method lookup on the delegate; the owner will be ignored
p.print.resolveStrategy = Closure.DELEGATE_ONLY

p.print.delegate = v
println p.toString()
