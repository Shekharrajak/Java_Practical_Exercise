
import java.util.*;


class pe5 {
    public static void main(String args[] ) {
        System.out.println("Enter numbers : ");
        Scanner sc = new Scanner(System.in);
        String num= sc.nextLine();
        String[] num_arr = num.split(",");
        for(int i=0;i<num_arr.length - 1;i++){
	       if(Integer.parseInt(num_arr[i]) >= Integer.parseInt(num_arr[i+1])){
            // System.out.println(Integer.parseInt(num_arr[i]));
            // System.out.println(Integer.parseInt(num_arr[i]));
            System.out.println("False");
            return;
           }
        }
        System.out.println("True");
    }
}
