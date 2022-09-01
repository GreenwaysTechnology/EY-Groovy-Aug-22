import com.ey.oo.hasa.Address
import com.ey.oo.hasa.Employee

def emp = new Employee(
        id: 1,
        salary: 50000,
        name: 'Subramanian',
        address: new Address(
                city: 'Coimbatore',
                state: 'TN',
                zipcode: '642111'))
println("${emp.id} ${emp.name} ${emp.salary} ${emp.address.city} ${emp.address.state}")