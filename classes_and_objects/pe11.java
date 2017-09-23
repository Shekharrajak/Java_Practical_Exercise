
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word);
        System.out.println("Reversed string: "  + new StringBuilder(word).reverse().toString());
        
        if(word.equals(new StringBuilder(word).reverse().toString())){
            System.out.println("Yes it is a palindrom.");
        }
        else{
            System.out.println("No, it is not a palindrom.");
        }

    }
}
