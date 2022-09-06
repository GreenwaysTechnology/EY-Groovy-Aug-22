package com.ey.fp.dynamic.runtimemeta

class Employee {
    String firstName
    String lastName
    int id

    //provide solution for property missing
    def propertyMissing(String propName) {
        "Property $propName is Missing in the class"
    }

    def methodMissing(String methodName, def methodArgs) {
        "method $methodName is not defined"
    }

}
