import com.ey.oo.inheritance.traits.Flyable
import com.ey.oo.inheritance.traits.dynamicbinding.Advanced
import com.ey.oo.inheritance.traits.dynamicbinding.Machine

//as operator binds the trait dynamically with class
def machine = new Machine() as Advanced
println(machine.doStuff())
println(machine.getMachineInfo())


def flyingMachine = new Machine() as Flyable;
println flyingMachine.fly()

//attaching more traits in one place
def newMachine = new Machine();
//bind traits dynamically
def newMachineWith = newMachine.withTraits(Flyable, Advanced)
println newMachineWith.getMachineInfo()
println newMachineWith.fly()
