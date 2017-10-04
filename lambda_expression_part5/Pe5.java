
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