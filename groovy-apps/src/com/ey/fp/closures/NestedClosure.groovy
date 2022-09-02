//Nested Closures
/**
 * inner closures cant be called outside directly because the scope of inner closure is subject
 * to outer closure
 * any inner closures cant be directly
 */

def outerCls = {
    println "Outer closure"
    def innerCls = {
        println "Inner closure"
        def innerMostcls = {
            println "Inner Most closure"
        }
        //calling innerMost Closure
        innerMostcls()
    }
    innerCls()
}
//calling nested cls
outerCls()
//innerCls()