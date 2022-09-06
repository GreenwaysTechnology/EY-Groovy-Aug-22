package com.ey.dsl

class TalkBuilder {
    def topic, location, when

    //methods : returns the same talk builder
    //location function
    def at(location) {
        this.location = location
        this; // returning the TalkBuilder object
    }

    def on(when) {
        this.when = when;
        println("I am Presenting $topic at $location on $when");
        this;
    }
}
