/*

Write a program to assign a lambda expression to its functional interface. 
Then we execute the lambda expression by calling the method defined 
in the functional interface and pass in a parameter. 

Input: Java Lambda Expression Demo      
Output : 27
*/

interface print_length{
	int length(String name);
}
public class Pe5 {
	
	// Constructor
	public Pe5(){
		
	}

	public static void main(String[] args){
		
		String strr = "Java Lambda Expression Demo";

		print_length pl = (str) -> { return str.length(); };

		System.out.println(pl.length(strr));
	}
	
}