import com.ey.oo.inheritance.typing.Bus
import com.ey.oo.inheritance.typing.Car

//Typing -Strong typing
Car car = new Car()
println(car.startEngine())

Bus bus = new Bus();
println(bus.startEngine())

//Typing-dynamic typing
def myCar = new Car();
println(myCar.startEngine())