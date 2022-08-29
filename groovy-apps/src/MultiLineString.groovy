//Multi line java synatx:
String title = "EY";
String doc = "<html>" +
        "<head>" +
        "<title>" + title + "</title>" +
        "<body>" +
        "<h1> Hello</h1>" +
        "</body>" +
        "</body></html>";
System.out.println(doc);

//multi line with ''' ''' -quote
def myDoc = '''
  <html>
  <head>
    <title>EY</title>
  </head>
  <body>
     <h1>Hello</h1>
  </body>
  </html>  
'''
println(myDoc)

//multi line with  """
// """ - interploation + multi line

def message = "Hello!"

def mynewDoc = """
  <html>
  <head>
    <title>$title</title>
  </head>
  <body>
     <h1>$message</h1>
  </body>
  </html>  
"""
println(mynewDoc)