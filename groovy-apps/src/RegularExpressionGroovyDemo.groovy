import java.util.regex.Matcher
import java.util.regex.Pattern

//Regular expression:
println "Regular Expression-Groovy Implementation"
//Step 1: declare input string
def inputString = "hey  hello 0 1, how subramanian , 7m3";
// String pattern = "\\d+";  //java syntax of defining pattern
//slashy strings are used to escape special characters
def pattern = /\d+/ //here we can escape special characters without using special characters

//Pattern compiledPattern = Pattern.compile(pattern);
//Pattern compiledPattern = ~/\d+/;
//Matcher digitMatcher = compiledPattern.matcher(inputString);

def compiledPattern = ~/\d+/;
def matcher = (inputString =~ /\d+/)

println("Source String " + inputString);
while (matcher.find()) {
    println(matcher.group());
}