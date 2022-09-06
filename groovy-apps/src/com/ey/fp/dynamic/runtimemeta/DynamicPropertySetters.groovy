package com.ey.fp.dynamic.runtimemeta

class DynamicPropertySetters {
    String prop

    void setProperty(String name, Object value) {
        this.@"$name" = 'bar'
    }
}
