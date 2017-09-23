
import java.util.*;
import java.math.BigDecimal;

import java.io.*;
import java.math.*;


// class Factorial{
//     int num;    
//     public Factorial(int i){
//         num = i;
//     }

// }
class pe17 {

    static ArrayList<BigInteger> l = new ArrayList<BigInteger>();
    public static BigInteger getFactorial(BigInteger n){
        if( n.compareTo(BigInteger.valueOf(0)) == 0 && n.compareTo(BigInteger.valueOf(l.size())) == -1 ){
            return l.get(n.intValue());
        }
        else{
            return n.multiply(getFactorial(n.subtract(BigInteger.valueOf(1))));
        }
    }

    public static void main(String args[]) throws Exception {
        // Factorial m = new Factorial(1312);
        // System.out.println(m.isEven());
        // System.out.println("Enter the numer :");

        // Scanner sc = new Scanner(System.in);
        // String num = sc.next();

        // System.out.println(BigInteger.valueOf(1));
        l.add(BigInteger.valueOf(1)); // 0 index 1
        l.add(BigInteger.valueOf(1)); // 1 index 1

        // BigInteger fact_number= new BigInteger(num);
        // System.out.println(getFactorial(BigInteger.valueOf(12)));
        
        BigInteger start = BigInteger.valueOf(0);
        while(true){
            long val = getFactorial(start).longValue();
            if(val > Integer.MAX_VALUE){
                System.out.println(start + " factorial : Out of range");
                break;
            }
            else{
                System.out.println(start + " factorial is :" + val);
            }
            start = start.add(BigInteger.valueOf(1));
        }

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // int number = Integer.MAX_VALUE + 2 ;
        // System.out.println(number);
        // System.out.println(new BigDecimal(new BigDecimal(Integer.MAX_VALUE) + new BigDecimal(2) ));
        // number.longValueExact() < Long.MAX_VALUE && number.longValue() > Long.MIN_VALUE
        // boolean b1 = (Integer.MAX_VALUE + 2 < Integer.MAX_VALUE) && (Integer.MAX_VALUE + 2 > Integer.MIN_VALUE);
        // System.out.println(b1);
        // System.out.println(l.get(0));

    }
}
