//How to read file using closures,dsl api
def baseDir = "./"
//eachLine reads data in the form of string
new File(baseDir, 'Greetings.txt').eachLine {
    println it
}
 new File(baseDir, 'Greetings.txt').eachLine { line,nb ->
    println "$nb $line"
 }
 def list = new File(baseDir, 'myfile.txt').collect {it}
 //you can convert into data stream:so that you can process
 list.stream().filter(item->item.startsWithIgnoreCase("a"))
         .map(String::toUpperCase).each {println it}