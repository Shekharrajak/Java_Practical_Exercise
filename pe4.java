/* IMPORTANT: class must not be public. */

/*
PE: 4 Write a program using a loop to print the following 
output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.  
Input: 5  Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 
*/
import java.util.*;

class Pe4 {
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
        
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }
}
