/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;

class Pe3 {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

        
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        for(int i=0;i<word.length();i++){
            if("aeiou".indexOf(Character.toLowerCase(word.charAt(i))) >= 0 ){
                System.out.print("Vowel ");
            }
            else{
                System.out.print("Consonent ");
            }
        }

    }
}
