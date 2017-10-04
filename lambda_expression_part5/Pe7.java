
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