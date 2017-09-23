
import java.util.*;

class Test {

    public Test(int s) throws OutOfRangeException {
        throw new OutOfRangeException (s);
    }
}
class pe6{
    public static void main(String args[] ) {
    
        try{
            Test t = new Test(1234);
        }
        catch(OutOfRangeException e){
            e.printStackTrace();
        }
        finally{   
            System.out.println("I am from final block");
        }
    }
}
