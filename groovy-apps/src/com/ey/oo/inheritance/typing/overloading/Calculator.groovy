package com.ey.oo.inheritance.typing.overloading

class Calculator {
    //different copy of the methods
    //overloading
    def add(int a = 0, int b = 0) {
        a + b
    }

    def add(int a, int b, int c) {
        a + b + c
    }

}
