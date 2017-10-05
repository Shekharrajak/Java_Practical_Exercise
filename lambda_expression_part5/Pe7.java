/*

Write a program to implement lambda expression which determines if one number is a factor of
 another along with the help of an interface with a method named test which accepts 
 2 integer.

  Input : 10,2
   Output :2 is a factor of 10

    Input : 10,3 Output : 3 is not a factor of 10
*/
interface factor{
	boolean check_factor(int i, int j);
}
public class Pe7 {
	
	// Constructor
	public Pe7(){
		
	}

	static void check_fact(int i, int j, factor f){
		System.out.println((f.check_factor(i, j)) ? "Yes" : "No"); 
	}

	public static void main(String[] args){
		int i = 10;
		int j = 2;
		check_fact(i, j, (ii,jj) -> { return ((ii % jj) == 0); });	
	}


	
}