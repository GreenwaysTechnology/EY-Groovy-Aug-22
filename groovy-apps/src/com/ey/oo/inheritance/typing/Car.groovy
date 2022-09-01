package com.ey.oo.inheritance.typing

class Car extends Vehicle {
    //overriding
    def startEngine() {
        "Car engine starts ${super.startEngine()}"
    }
    //extra method which is not derived from parent class
    def initAndroidApp() {
        "App is being initalized"
    }
}
