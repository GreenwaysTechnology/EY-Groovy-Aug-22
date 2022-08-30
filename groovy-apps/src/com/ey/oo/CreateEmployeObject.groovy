import com.ey.oo.Employee

//Strong typing
//Employee is type
//emp is reference variable
//new is keyword
//Employee() - constructor call
Employee emp = new Employee();
//trigger setters
emp.firstName = "Subramanian"
//trigger getters
//Object access operator "."
println " id : ${emp.id}"
println " Name : ${emp.firstName}"
println " status : ${emp.status}"
println " Salary : ${emp.salary}"
println " Total : ${emp.calculate()}"

//dynamic type
def employee = new Employee()

println " id : ${employee.id}"
println " Name : ${employee.firstName}"
println " status : ${employee.status}"
println " Salary : ${employee.salary}"
println " Total : ${employee.calculate()}"
