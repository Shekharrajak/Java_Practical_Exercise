import java.util.*;

class Pe1{

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
