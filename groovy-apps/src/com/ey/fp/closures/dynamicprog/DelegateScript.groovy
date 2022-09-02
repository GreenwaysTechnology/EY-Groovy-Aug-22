
//delegate property has value by default the enclosing object.
def mycls = {
    println "this : " + this;
    println "Owner :" + owner // who is controlling this closure
    println "Delegate : " + delegate
}
mycls()