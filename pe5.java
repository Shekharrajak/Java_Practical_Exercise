/* IMPORTANT: class must not be public. */

/*
PE: 5 Write a program that reads an unspecified number of integer arguments 
using Scanner Class and adds them together. The program should display total 
of the given input number and should only consider integer value. 
The program should display an error message if there are any non integer
 values Input :  12 23 2 4 Output : 41
*/
import java.util.*;

class Pe5 {
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
        int sum = 0;
        
        for(int i=1;i<=num;i++){
            sum +=  sc.nextInt();

        }
        System.out.println(sum);
}
}
