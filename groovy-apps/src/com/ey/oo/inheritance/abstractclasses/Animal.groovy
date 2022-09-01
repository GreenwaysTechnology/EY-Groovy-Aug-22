package com.ey.oo.inheritance.abstractclasses

abstract class Animal {
    //to be implemented by implementors
    abstract void eat()
    //common method across the child classes
    def saveAnimals() {
        "Save Animals From Hunters"
    }
}
