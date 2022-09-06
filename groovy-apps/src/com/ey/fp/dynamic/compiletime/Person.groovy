package com.ey.fp.dynamic.compiletime

import groovy.transform.ToString


//@ToString
@ToString(excludes = ['state', 'city'])
class Person {
    String firstName
    String lastName
    String city
    String state
//
//    //Override toString method
//    @Override
//    String toString() {
//        return "first $firstName last $lastName"
//    }
}
