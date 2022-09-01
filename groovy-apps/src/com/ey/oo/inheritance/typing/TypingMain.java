package com.ey.oo.inheritance.typing;

import javax.swing.*;

public class TypingMain {
    public static void println(Object str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        /**
         * During compile time
         *  The compiler always looks "type/leftSide"
         *   Car car = new Car();
         *   Here type is Car
         *    Vehicle vehicle = new Car();
         *    vehicle.initAndroidApp()
         *    Here initAndroidApp method is not present in the type
         *  How to fix this problem?
         *     Type casting -  down casting
         *             //Type casting
         *         Car tmpCar =(Car) vehicle;
         *         println(tmpCar.initAndroidApp());
         *   In java every class has supreme  class called "java.lang.Object"
         *
         *   A.java
         *   class A {}
         *    After Compilation
         *    Class A extends java.lang.Object{}
         *
         *    Source code
         *    class B {}
         *    class C extends B{}
         *
         *    class B extends java.lang.Object{}
         *    class C extends B {}
         *
         *    so based on this rule, the reference variable type  can be even Object also
         *
         *    Car car = new Car()
         *    Vehicle car = new Car()
         *    Object car = new Car()
         *
         *
         */

        Car car = new Car();
        println(car.startEngine());
        println(car.initAndroidApp());

        Vehicle vehicle = new Car();
        println(vehicle.startEngine());
        //Type casting
        Car tmpCar = (Car) vehicle;
        println(tmpCar.initAndroidApp());

        Object objCar = new Car();
        Car tmpObjCar = (Car) objCar;
        println(tmpObjCar.startEngine());
        println(tmpObjCar.initAndroidApp());

    }
}
