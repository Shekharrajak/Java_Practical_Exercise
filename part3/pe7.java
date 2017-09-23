
import java.util.*;

class pe7{
    public static void main(String args[] ) {
    
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("in  NullPointerException ");
        }

        finally{   
            System.out.println("I am from final block");
        }
    
        int[] a = new int[2];
        try{
            System.out.println(a[3]);
        }
        catch(IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("in  IndexOutOfBoundsException ");
        }

        finally{   
            System.out.println("I am from final block");
        }

        // int[] a = new int[-2];
        try{
            int[] a1 = new int[-2];
        }
        catch(NegativeArraySizeException e){
            e.printStackTrace();
            System.out.println("in  NegativeArraySizeException ");
        }

        finally{   
            System.out.println("I am from final block");
        }

    }
}
