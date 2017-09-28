
import java.util.*;

// pe 2
class outer {
    public static Inner getInnerObject(){
        Inner ret = new Inner();
        return ret;
    }
    static class Inner{
        public Inner(){
            System.out.println("I am inner class");
        }
    }
    public static void main(String args[] )  {
        outer o = new outer();
        o.getInnerObject();
    }
}
