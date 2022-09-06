def speak(topic) {
    //return Map
    ['at': { location ->
        //return map
        ['on': { when ->
            println("I am Presenting $topic at $location on $when");
        }]
    }]
}

speak "Groovy" at "EY" on 'Sep 06'

//refactored code of the above
def talk(topic) {
    //return Map
    ['at': { location ->
        //return map
        ['on': { println("I am Presenting $topic at $location on $it"); }]
    }]
}

talk "Groovy" at "EY" on 'Sep 06'

//please show the square_root of 100

//sub closure
show = { println it }
square_root = { Math.sqrt it }

//action =show
def please(action) {
    [
            the: { what ->
                [of: { n -> action(what(n))
                }]
            }
    ]
}

please show the square_root of 100
