import com.ey.oo.inheritance.traits.Bird
import com.ey.oo.inheritance.traits.Hai

def bird = new Bird()
println(bird.fly())

//abstract method with implementation
def hai = new Hai()
println(hai.greeting())