import com.ey.oo.constructor.User

def user = new User(); //calls empty constructor
//print default values:
println("id ${user.id}")
println("Name ${user.name}")
println("Status ${user.status}")
//init values using setters
user.id = 1;
user.name = 'Subramanian'
user.status = true
println("id ${user.id}")
println("Name ${user.name}")
println("Status ${user.status}")

//create object passing parameters to constructors

//user = new User(12,"Ram",true) //invalid syntax

//three arg constructor
user = new User(id: 12, name: "Ram", status: true)
println("id ${user.id}")
println("Name ${user.name}")
println("Status ${user.status}")

//two arg
user = new User(name: "Ram", status: true)
println("id ${user.id}")
println("Name ${user.name}")
println("Status ${user.status}")

user = new User(name: "Ram")
println("id ${user.id}")
println("Name ${user.name}")
println("Status ${user.status}")