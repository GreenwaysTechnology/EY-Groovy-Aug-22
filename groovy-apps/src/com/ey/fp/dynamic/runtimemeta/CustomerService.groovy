package com.ey.fp.dynamic.runtimemeta

class CustomerService {

    //provide solution for property missing
    def propertyMissing(String propName) {
        "Property $propName is Missing"
    }

    def methodMissing(String methodName, def methodArgs) {
        "method $methodName is not defined"
    }

}
