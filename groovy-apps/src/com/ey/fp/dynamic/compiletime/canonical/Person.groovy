package com.ey.fp.dynamic.compiletime.canonical

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

//@ToString
//@EqualsAndHashCode
//@TupleConstructor
//class Person {
//    int id
//    String name
//    String city
//}
@Canonical
class Person {
    int id
    String name
    String city
}