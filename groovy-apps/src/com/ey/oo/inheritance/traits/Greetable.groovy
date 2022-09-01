package com.ey.oo.inheritance.traits

trait Greetable {
    abstract String name();

    //calling abstract method with interplation inside trait
    String greeting() {
        "Hello ${name()}"
    }
}