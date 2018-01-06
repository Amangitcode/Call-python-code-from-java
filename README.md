Call python code from java    

Its EZ
-----------------------------------------------------
    Download Jython 2.7.0 - Standalone Jar 
http://www.jython.org/downloads.html
    
    Add this to your java path in eclipse......
    In the Package Explorer (on the left), right click on your Java project and select Properties.
    In the treeview on the left, select Java Build Path.
    Select the Libraries tab.
    Select Add External JARs...
    Browse to your Jython installation (C:\jython2.5.2 for me), and select jython.jar. Click apply and close.
    
    
    Java class (main) //use your won package name and python class dir
    ----------------
    
    package javaToPy;
    import org.python.core.PyObject;
    import org.python.util.PythonInterpreter;
    
    public class JPmain {
    	
    	@SuppressWarnings("resource")
    	public static void main(String[] args) {
    
        PythonInterpreter interpreter = new PythonInterpreter();
        
        //set your python program/class dir here
        interpreter.execfile
        ("C:\\Users\\aman0\\Desktop\\ME\\Python\\venv\\PYsum.py");
        
        PyObject str1 = interpreter.eval("repr(sum(10,50))");
        System.out.println(str1.toString());
        
        PyObject str2 = interpreter.eval("repr(multi(10,50))");
        System.out.println(str2.toString());
        
    
        interpreter.eval("repr(say())");
        
    
        interpreter.eval("repr(saySomething('Hello brother'))");
    	
    }
    
    }
    
    ---------------------------
    Python class
    ------------
    
    def sum(x,y):
        return x+y
    
    def multi(a,b):
        return a*b
    
    def say():
        print("Hello from python")
    
    def saySomething(word):
        print(word)`enter code here`