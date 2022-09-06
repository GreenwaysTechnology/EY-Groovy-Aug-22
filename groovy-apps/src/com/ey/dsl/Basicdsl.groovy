//Creating dsl programmings using plain functions.

def presentation(Map args, String topic) {
    //println ("Hello")
//    println "Hello" // dsl syntax: we can ommit ()
    println "I am Presenting about $topic at $args.at on $args.on"
}

presentation('Groovy DSL', at: 'EY', on: 'Sep 06')
presentation 'Groovy DSL', at: 'EY', on: 'Sep 06'
