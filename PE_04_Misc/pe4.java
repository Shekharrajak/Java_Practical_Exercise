
import java.util.*;

// pe 4
class pe4 {

     public static void main(String[] args) {

        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getStackTrace());
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
            System.out.println(e.getStackTrace());
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
            System.out.println(e.getStackTrace());
            System.out.println("in  NegativeArraySizeException ");
        }

        finally{   
            System.out.println("I am from final block");
        }

    }
}
