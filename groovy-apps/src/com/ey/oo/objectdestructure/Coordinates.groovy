package com.ey.oo.objectdestructure

class Coordinates {
    public double latitutde;
    double longitude;
    //object destructing api
    def getAt(int idx) {
        if (idx == 0) latitutde
        else if (idx == 1) longitude
        else throw new Exception("Property not found")
    }
}