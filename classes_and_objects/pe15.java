
import java.util.*;

class EvenNumTest{
    int num;    
    public EvenNumTest(int i){
        num = i;
    }
    
    public boolean isEven(){
        return (num % 2 == 0);
    }
}
class pe15 {
    public static void main(String args[] ) throws Exception {
        EvenNumTest m = new EvenNumTest(1312);
        System.out.println(m.isEven());
        
    }
}
