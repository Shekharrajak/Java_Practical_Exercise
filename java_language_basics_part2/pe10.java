/*
PE 10: Write a program for the following condition:
 Given 2 inputs , where input1 is string and input 
 2 is integer value, the last n characters should repeat n number 
 of times in the output String. Input1:            Stackroute Input2:  
           5 Output1:           Stackrouterouterouterouterouteroute

 Input1:            Stackroute Input2:            2 Output1:           Stackroutetete
*/

 import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int num= sc.nextInt();
        String substr = str.substring(str.length() - num);
        // System.out.println(substr);
        System.out.print(str);
        for(int i=0;i<num;i++){
            System.out.print(substr);
        }
    }
    
}
