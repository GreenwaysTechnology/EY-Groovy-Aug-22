def sayHello = null

//with String(type)
sayHello = { String name -> println("Name $name") }
sayHello("Subramanian")

//with def keyword
sayHello = { def name -> println("Name $name") }
sayHello("Subramanian")

//without type or def
sayHello = { name -> println("Name $name") }
sayHello("Subramanian")

//it keyword :  no need to represent variable "single param" can be explicitly accessed with "it"
sayHello = {
    println("Name $it")
}
sayHello("Subramanian")


