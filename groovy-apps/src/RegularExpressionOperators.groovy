import java.util.regex.Matcher

def text="mytext 45 67"
//=~ Find operator which returns Matcher
def matcher = (text =~/\d+/);
println matcher instanceof Matcher;

// ==~ : match operator which returns boolean

def result =  (text ==~/\d+/)
println(result)