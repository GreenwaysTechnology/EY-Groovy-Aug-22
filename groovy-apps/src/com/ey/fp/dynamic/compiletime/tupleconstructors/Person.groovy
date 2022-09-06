package com.ey.fp.dynamic.compiletime.tupleconstructors

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Person {
    int id
    String name
    String city
}
