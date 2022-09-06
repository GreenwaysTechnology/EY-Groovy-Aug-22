import com.ey.fp.dynamic.runtimemeta.CustomerService

//add new method during runtime
def customerService = new CustomerService();

//add property via meta class
customerService.metaClass.id = 1
customerService.metaClass.name = 'Subramanian'
customerService.metaClass.city = 'Coimbatore'

//dynamic method injection via closure
customerService.metaClass.list = {
    "CustomerList"
}

println(customerService.list())
println(customerService.id)
println(customerService.name)
println(customerService.city)
print(customerService.foo)

//add new Method in existing String class

String.metaClass.capitalize = {String it ->
    it.substring(0, 1).toUpperCase() + it.substring(1)
}
def name ="subramanian";
println name
print(name.capitalize())









