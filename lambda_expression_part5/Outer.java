/*
Write a class named Outer that contains an inner class named Inner
. Add a method
 to Outer that returns an object of type Inner. In main( ), create 
 and initialize a reference to an Inne
*/

// pe2
public class Outer {

	public class Inner{
		public Inner(){
			System.out.println("I am inner");
		}
	}

	Inner in;
	// Constructor
	public Outer(){
		in = new Inner();
	}

	public static void main(String[] args){
		Outer ot = new Outer();
	}
	
}