
import java.util.*;

// pe 3
class pe3 {
    public pe3(){
        throw new IllegalArgumentException();
    }
    public static void main(String args[] )  {
        try{
            pe3 o = new pe3();
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getStackTrace());
        }
        finally{
            System.out.println("I am in  final block");
        }
        
    }
}
