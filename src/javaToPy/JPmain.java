package javaToPy;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;



public class JPmain {
	
	@SuppressWarnings("resource") 
	public static void main(String[] args) {

    PythonInterpreter interpreter = new PythonInterpreter();
    
    //set your python program/class dir here
    interpreter.execfile("C:\\Users\\aman0\\Desktop\\ME\\Aupurbo\\javaToPy\\resources\\PYsum.py");
    
    PyObject str1 = interpreter.eval("repr(sum(10,50))");
    System.out.println(str1.toString());
    
    PyObject str2 = interpreter.eval("repr(multi(10,50))");
    System.out.println(str2.toString());
    
    //no required to create any object as this method is not returning anything
    interpreter.eval("repr(say())");
    
    //no required to create any object as this method is not returning anything
    interpreter.eval("repr(saySomething('Hello brother'))");
	
}

}
