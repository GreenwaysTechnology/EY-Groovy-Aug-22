/**
 * //
 // Source code recreated from a .class file by IntelliJ IDEA
 // (powered by FernFlower decompiler)
 //

 import groovy.lang.Binding;
 import groovy.lang.Script;
 import org.codehaus.groovy.runtime.InvokerHelper;
 import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;

 public class ScriptFile extends Script {
 public ScriptFile() {
 }

 public ScriptFile(Binding context) {
 super(context);
 }

 public static void main(String... args) {
 InvokerHelper.class.invoke<invokedynamic>(InvokerHelper.class, ScriptFile.class, args);
 }

 public Object run() {
 Object firstName = "Subramanian";
 this.invoke<invokedynamic>(this, firstName);
 return this.invoke<invokedynamic>(this, this.invoke<invokedynamic>(this, 10, 10));
 }

 public int add(int a, int b) {
 return DefaultTypeTransformation.intUnbox(a.invoke<invokedynamic>(a, b));
 }
 }
 */

//variable declaration will go inside run method of script class
def firstName = 'Subramanian'
println(firstName)

//functions : unit of execution : methods
//static typed syntax and dynamic typed syntax

//methods declarations will go inside script class, and invoked inside run method
int add(int a, int b) {
    return a + b
}
println(add(10,10))