//Def keyword
import com.ey.oo.inheritance.typing.Bus
import com.ey.oo.inheritance.typing.Car
import com.ey.oo.inheritance.typing.Vehicle

//Typing -Strong typing
//Car is type
//car is variable
//new is keyword
//Car() -  constructor call

/**
 * The type of variable can be "The Object type itself" - Program to concrete type/same type
 *   Car car =new Car()
 * The type of variable can be "Super class type" - Program to super type
 *  Vehicle mycar = new Car()
 */
//Program to concrete
Car car = new Car()

//call method
println(car.startEngine())
println(car.initAndroidApp())

//Program to super type
//Here the type is Vehicle
Vehicle vehicle = new Car();
println(vehicle.startEngine())
//in Groovy casting happens automatically
println(vehicle.initAndroidApp())

//since casting happens automatically, then why we need type, thats what we use def keyword

//def is replaced by "Object"
def myNewCar = new Car();
println(myNewCar.initAndroidApp())
println(myNewCar.startEngine())


