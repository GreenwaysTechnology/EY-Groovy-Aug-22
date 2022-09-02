//Variable args : we dont know in advance how many parameters we pass.

def concat = { String... args ->
    args.join(' ')
}
//calling concat with many args
println concat('subramanian', 'murugan')
println concat('a', 'b', 'c', 'd', 'e', 'f')