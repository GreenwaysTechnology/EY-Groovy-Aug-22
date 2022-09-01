import com.ey.oo.inheritance.interfaces.Bird
import com.ey.oo.inheritance.interfaces.Flyable

//interface
Flyable bird = new Bird()
println(bird.fly())
println(bird.buildNest())
println(bird.eat())
def mybird = new Bird()
println(mybird.fly())
println(mybird.buildNest())
println(mybird.eat())