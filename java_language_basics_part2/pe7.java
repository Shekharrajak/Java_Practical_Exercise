/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;

class Pe7 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] str_arr = str.toCharArray();
        
        // for(char c: str_arr){
        //     System.out.println(c);
        // }
        Arrays.sort(str_arr);
        
        for(char c: str_arr){
            System.out.print(c +  " ");
        }
        System.out.println();
        int sum=0;;
        for(int i=str.length() - 1; i>=0;i--){
            int n = Integer.parseInt(String.valueOf(str_arr[i]));
            if(n % 2 == 0){
                sum+=n;
            }
        }
        System.out.println(sum);
        if(sum > 15){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
