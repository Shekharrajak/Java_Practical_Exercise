/*

PE 1: Write a program which accepts a number as input and check
 whether the given number is palindrome or not If it is a palindrome then 
 a. Add all the even numbers and check whether the sum is more than 25.  
    b. Print success and failure messages for all 3 conditions Input :
     2468642 Output : 2468642 is palindrome and the sum of even numbers is
      greater than 25 Input: 12345 Output: 12345 is not palindrome Input:
       12345654321 Output : 12345654321 is palindrome and sum of even numbers is less than 25 


*/

import java.util.*;
import org.apache.log4j.Logger;

class Pe1{
        final static Logger logger = Logger.getLogger(Pe1.class);

    public static boolean palindrom_check(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static int check_twenty_five(String str){
        int num = Integer.parseInt(str);
        if(num> 25){
            return 1;
        }
        else if(num < 25){
            return 2;
        }
        return 0;
    }
    public static void main(String ars[]){

        System.out.println("hello..");
        Scanner sc = new Scanner(System.in);
        String str = sc.next("Enter the string to check palindrom: ");
        logger.error("Sorry, something wrong!");
        if(palindrom_check(str)){
            switch(check_twenty_five(str)){
                case 0: System.out.println("Number is palindrom and equal to 25");break;
                case 1: System.out.println("Number is palindrom and great to 25");break;
                case 2: System.out.println("Number is palindrom and less to 25"); break;
            }
        }
        else{ 
                System.out.println("Number is not palindrom.");
        }

    }

}
