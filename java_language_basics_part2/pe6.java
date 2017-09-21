
import java.util.*;

class Pe1 {
    public static void main(String args[] ) throws Exception {
        
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] word_arr = word.toCharArray();
        for(int i=0;i<word_arr.length;i++){
            if(Character.isDigit(word_arr[i])){
                System.out.println(word_arr[i] + " is a digit.");
            }
            else if(Character.isLetter(word_arr[i])){
                System.out.println(word_arr[i] + " is a letter.");
                            if(Character.isLowerCase(word_arr[i])){
                                System.out.println(word_arr[i] + " is a lowercase.");
                            }
                            if(Character.isUpperCase(word_arr[i])){
                                System.out.println(word_arr[i] + " is a uppercase.");
                            }
            }

            else{
                System.out.println(word_arr[i] + " is a special character.");
            }
        }

    }
}
