import java.util.*;   

public class pe7 {   
	public static void main(String[] args) {    
		ArrayList<String> c1= new ArrayList<String>(); 
        c1.add("Java");           
        c1.add("C");           
        c1.add("C++");           
        c1.add("Python");           
        c1.add("JavaScript");           


        int s_c1 = c1.size();
        
        ArrayList<String> c2= new ArrayList<String>();           
        c2.add("Java");           
        c2.add("Angular");           
        c2.add("C++");           
        c2.add("JavaScript");           
        //Complete code to store the comparison output in ArrayList<String>       
        int s_c2 = c2.size();

        int m_size = s_c1 > s_c2 ? s_c1 : s_c2;
        for(int i=0;i<m_size;i++){
        	try{
        		System.out.println(c1.get(i) == c2.get(i));	
        	}
        	catch(IndexOutOfBoundsException e){
        		System.out.println("false");
        	}
        	
        }
    } 
}
