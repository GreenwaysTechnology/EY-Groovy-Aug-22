//Scope: Closures not groovy Closure
/**
 * The outer function variables(local variables and arg variables) are  accessed inside inner
 * function becomes closure- the life of outer function variables are hoisted into inner functions
 *  */

def counter(def state) {
    int a = 0;
    def inc = {
        ++a // inner closure access outer method/closure variables
    }
}
def inc = counter()
println inc()
println inc()