

def product = [
        id   : 1,
        name : 'Phone',
        qty  : 100,
        price: 10000.78
]
product.each { entry -> println(entry) }

product.each { entry -> println("${entry.key} ${entry.value}") }

def users = [
        id    : 1,
        name  : 'Subramanian',
        skills: [
                skillId: 100,
                skill  : 'Groovy'
        ]
]
users.each {key,value->
    println("${key} ${value}")
    if(value instanceof  java.util.Map){
        println(value.get("skillId") + value.get("skill"))
    }
}