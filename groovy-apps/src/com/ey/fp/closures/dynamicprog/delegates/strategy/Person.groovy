package com.ey.fp.closures.dynamicprog.delegates.strategy

class Person {
    String name
//    def print = {
//        "My Name is ${name}"
//    }
//    String toString(){
//        print()
//    }
    def print = {
        "My Name is ${name}"
    }

    String toString() {
        print()
    }
}
