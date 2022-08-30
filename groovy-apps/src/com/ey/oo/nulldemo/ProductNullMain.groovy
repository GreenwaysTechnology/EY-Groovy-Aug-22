import com.ey.oo.nulldemo.Product

//Product Main

//Product product=null
def product = null
//println (product.id) //throws nullPointer Exception
println(product?.id) // avoid nullpointerException and returns null string message
println(product?.id ? product.id : "No Id") //replace with meaningfull value
println(product?.id ?: 0) //replace with meaningfull value using elvish operator

println("something")