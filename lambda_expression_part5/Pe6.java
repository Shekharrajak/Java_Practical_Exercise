/*


 Write a program to create interface with single method and use it as 
 lambda expression to multiply the given value by 2. When creating the lambda expression
  we declare the type of the parameter s1 to have the Integer type.  

  Input: 4  
  Output: 1- Result : 8
*/

interface mulit_two{
	int multi(int num);
}

public class Pe6 {
	
	// Constructor
	public Pe6(){
		
	}

	public static void main(String[] args){
		int i = 5;
		mulit_two mt = (n) -> { return n*2; };

		System.out.println(mt.multi(i));		
	}
	
}