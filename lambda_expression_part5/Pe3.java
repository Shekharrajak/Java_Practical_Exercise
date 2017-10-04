/*


Write a program to implement reverseSelector( ) which provides the
 following output 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 .

  a. Create an 
 interface named selector with methods end, current, next.
  b.
  Create an outer class named Sequence which accepts the size 
  from which you can reverse the numbers,    
  c. Create an inner class named ReverseSequenceSelector which implements the Selector    
     interface and try to reverse the number. d. finally implement every classes in main
      and run the code.

    Input: 15 Output : 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0

*/

import java.util.*;


interface reverseSelector{
	void get_reverse(String name);
}
public class Pe3 {
	

	public class ReverseSequenceSelector implements selector{
		public void reverse(int current, int next, int end){
			
		}

	}


	// Constructor
	public Pe3(){
		
	}

	public static void main(String[] args){

		List<Integer> list = new ArrayList<Integer>();
		for(int i= 0;i<15;i++){
			list.add(i);
		}
		String name = "shekhar";
		reverseSelector rs = (n) -> {
			Collections.reverse(list);
			list.forEach((l) -> System.out.print(l + " "));
			System.out.println(n);
		};

		rs.get_reverse(name);
	}
	
}