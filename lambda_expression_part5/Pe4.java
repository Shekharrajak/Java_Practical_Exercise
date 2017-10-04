/*

Create an interface named Hand with a method facepalm, and implement 
that interface by defining in an inner 
class named Palm within a method of the outer class, which returns
a reference to your interface.

*/
public class Pe4 {
	

	// Constructor
	public Pe4(){
		
	}

	public Hand get(){	
		Hand hd;
			class Palm implements Hand{
				public void facepalm(){
					System.out.println("facepalm...");
				}

				public void getHand_test(){
					// Hand h;
					// hd = h;
					System.out.println("get hand method");
				}
			}
		Hand p = new Palm();
		p.facepalm();
		// p.getHand();
		return p;
	}

	public static void main(String[] args){
		Pe4 p = new Pe4();
		p.get();
	}
	
}