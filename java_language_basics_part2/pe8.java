/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

import java.util.*;


class Pe8 {
    public static void main(String args[] ) throws Exception {
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int num;
        Random ran = new Random();
        int x = ran.nextInt(2) + 5;
        System.out.println(x);
        // System.out.println(x);
        System.out.println("Guess the number : ");
        num = sc.nextInt();
        while(num != x){
            if(num<x){
                System.out.println("Number is less.");
            }
            else{
                 System.out.println("Number is High.");
            }
            System.out.println("try again : ");
            num = sc.nextInt();
            
        }
        System.out.println("Yes! matched..");
    }
    
}
