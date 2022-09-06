import com.ey.fp.dynamic.compiletime.Person
import com.ey.fp.dynamic.compiletime.SavingsAccount

def person = new Person(firstName: "Subramanian",
        lastName: "Murugan",
        city: "Coimbatore", state: "Tamil Nadu")
//com.ey.fp.dynamic.compiletime.Person@199e4c2b
//package.ClassName@HashCode
//this statement behind it invokes toString method by default.
println(person)

def account = new SavingsAccount(name: 'Ram', accountId: 1, accountType: "savings", balance: 34000)

print(account)