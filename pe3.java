/* IMPORTANT: class must not be public. */

/*
PE 3: Create a program that accepts a word as input and checks 
for each single character letter in the word whether it is a consonant
 or vowel. Condition:           
    a. Print an error message if the input is not a letter               
    b. If the input having more than one letter, print the required output     
           (Vowel or Consonant) for each 
    letter Input : p Output : Consonant Input : ap Output :
     Vowel Consonant (should it be a - vowel, p - consonant)
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
            else if("0123456789".indexOf(Character.toLowerCase(word.charAt(i))) >= 0 ){
                System.err.println("Error: integer entered.");
                // System.out.println("Error: integer entered ");
                System.exit(1);
            }
            else{
                System.out.print("Consonent ");
            }
        }

    }
}
}
