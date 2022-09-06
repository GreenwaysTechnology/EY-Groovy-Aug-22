def list = [] // empty list
//add new item
println list.empty

list.add(12)
//use << add operator
list << 10
list << 20

println list
//list processing
def set = [1, 1, 1, 1, 2, 3, 3, 4, 5, 5, 6, 6]
println "Num of Occurance Items ${set.count(1)}"
//sorting
def sortedList = [6, 3, 100, 0, 1].sort()
println(sortedList)