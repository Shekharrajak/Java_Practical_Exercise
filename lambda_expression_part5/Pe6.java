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