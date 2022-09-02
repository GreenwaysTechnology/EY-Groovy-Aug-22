//Left curry : left parameter is passed implicitly, right parameters are passed manually
def nCopies = { int n, String str -> str * n }
//left curry is called with curry method
def twice = nCopies.curry(2)
def fiveTimes = nCopies.curry(5)

println nCopies(2, "Ram")

println twice('Subramanian')
println fiveTimes('Subramanian')

//Right curry: supply right most parmeter fixed and other parameters are passed implicitly
def noOfCopies = { int n, String str -> str * n }
def greeterRepeter = noOfCopies.rcurry('greeter')
println greeterRepeter(5)

//index based curry: we can select which parameter is implicit

def volume = { double l, double w, double h ->
    println "l ${l} w $w h $h"
    l * w * h
}
def fixedVolum = volume.ncurry(0, 2d)
println fixedVolum(3d, 4d)