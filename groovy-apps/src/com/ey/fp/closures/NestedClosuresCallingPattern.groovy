def outerCls = {
    println "Outer closure"
    def innerCls = {
        println "Inner closure"
        def innerMostcls = {
            println "Inner Most closure"
        }

    }
}
//outer()inner()innerMost()
outerCls()()()
