//Slashy Strings:

//syntax1 : normal string
def str = /This is slashy string/
println str

//if you want to insert special characters inside string
def quote = " Hello ! how are you? \\ i am fine what \" about you ";
println quote;

//Syntax 2 : it allows special characters as
def myquote =/Hello ! how are you? \ i am fine what " about you/;
println myquote

//syntax 3 : multi line with slashy strings

def doc = / hello
 how are you?
 welcome
 '
 greetings   
/;
println doc;

// syntax 4 : interpolation with slashy strings
def name='Subramanian'
def greeting= / Hello ${name} /;
println greeting