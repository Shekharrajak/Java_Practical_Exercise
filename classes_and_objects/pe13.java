
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number is: " + num);
        int count =0;
        // check if it is power of two
        // System.out.println(num && (num & (num -1)));
        // if( num > 0 && (num & (num -1)) > 0){
        //     //check for 2 bits set
        //     while(num > 0 ){
        //         count += 1;
        //         num = num >> 1;
        //     }
        // }
        
        // if(count != 0 && count % 2 == 0){
        //     System.out.println("yes power of 4 ");
        // }
        // else{
        //     System.out.println("not power of 4 ");
        // }
        
        double power_num = Math.log(num) / Math.log(4);
        if(num  == Math.pow(4, power_num)){
            System.out.println("yes power of 4 ");
        }
        else{
            System.out.println("not power of 4 ");
        }

    }
}
