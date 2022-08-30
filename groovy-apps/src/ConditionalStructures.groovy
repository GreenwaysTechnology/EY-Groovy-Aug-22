def isActive = true;
if (isActive) {
    println "Active"
} else {
    println "Not Active"
}
//def x = "hello";
//def result = "";
def x = 122

switch (x) {
    case "foo":
        result = "foo value"
        break
    case "bar":
        result = "bar value"
        break
    case 122:
        result = "some numbers"
        break
    case true:
        result = "some boolean"
        break
    case Integer:
        result = "Integer value"
        break
    case ~/fo*/:
        result = "Regular expression value"
        break
    case Number:
        result = "Number value"
        break;
    default:
        result = "No match found"
        break;
}
println result;