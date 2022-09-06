package com.ey.fp.dynamic.compiletime.equalshashcode

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode(includes = ['id','name'])
class Person {
    int id
    String name
    String city
}
