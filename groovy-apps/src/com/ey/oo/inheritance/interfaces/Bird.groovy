package com.ey.oo.inheritance.interfaces

class Bird implements  Flyable ,Eatable{
    @Override
    def fly() {
        return "Bird is flying"
    }

    @Override
    String eat() {
        return "Bird eats"
    }

    def buildNest(){
        return "Build Nest"
    }
}
