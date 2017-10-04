
/*

1. Create a class with a non-default constructor (one with arguments) 
and no default constructor (no "no-arg" constructor). Create a second class
 that has a method that returns a reference to an object of the first 
class.Create the object that you return by making an anonymous inner 
class that inherits from the first class. 

*/


public class Pe1{
	
	// Constructor
	public Pe1(){
		
	}

	public Pe1(String s){
		anotherClass an = new anotherClass();
		// System.out.println("pe1 const");
		Inner in = an.get_class();
		in.get();
	}

	public static void main(String[] args){
		Pe1 p = new Pe1("something");
	}
	
}