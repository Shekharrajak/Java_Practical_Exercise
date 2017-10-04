
import java.util.*;

// pe 3
class Pe3 {
    public Pe3(){
        throw new IllegalArgumentException();
    }
    public static void main(String args[] )  {
        try{
            Pe3 o = new Pe3();
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getStackTrace());
        }
        finally{
            System.out.println("I am in  final block");
        }
        
    }
}
