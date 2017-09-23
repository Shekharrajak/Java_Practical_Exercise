
import java.util.*;


class pe4 {
    public static void main(String args[] ) {
    
    	String w="WW";
    	String b = "BB";
    	boolean toggle = true;
        for(int i=0;i<8;i++){
        	for(int j=0;j<8;j++){
        		System.out.print((toggle == true ? w : b) + " | ");
        		toggle = !toggle;	
        	}
        	System.out.println();
            toggle = !toggle;	
        }
    }
}
