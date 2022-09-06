import com.ey.fp.dynamic.runtimemeta.Employee

def employee = new Employee(id: 1, firstName: 'Subramanian', lastName: 'Murugan')

//accessproperty
println(" ${employee.id}")
println("Name ${employee.firstName} ${employee.lastName}")
//property you access which does not present
println("Address ${employee.city}")

//method calling
println("method ${employee.calculate()}")
