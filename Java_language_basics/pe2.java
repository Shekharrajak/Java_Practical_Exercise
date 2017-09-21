/*

PE 2: Write a program which accepts an integer number as input
 from the user and perform the following conditional checks: a.
  Print Tom if number is odd and exists between 20 to 30    
   b. Print Jerry, if number is even and exists between 20 and 30 

*/
import java.util.*;

class Pe2 {
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
        int num = sc.nextInt();
        
        if(num%2 == 0){
            if(num< 30 && num>=20){
                System.out.println("Number is even and betweenn 20 and 30. ");
            
            }
        }
        else{
            if(num< 30 && num>=20){
                System.out.println("Number is odd and betweenn 20 and 30. ");
            
            }
        }

    }
}
