package com.ey.fp.dynamic.compiletime

import groovy.transform.ToString

@ToString(includeSuper = true)
class SavingsAccount extends Account{
    String name
    double balance
}
