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
