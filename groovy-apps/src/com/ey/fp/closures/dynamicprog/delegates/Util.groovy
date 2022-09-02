package com.ey.fp.closures.dynamicprog.delegates

class Util {
    def add = {
        delegate.a + delegate.b
    }
}