package com.ey.fp.closures

class Bar {
    def myls = {
        println "Bar "
        println "this : " + this;
        println "owner : " + owner;
        println "Delegate : " + delegate

    }
}