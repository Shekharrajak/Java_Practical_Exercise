
import java.util.*;
import java.text.DateFormat;  
import java.util.Date;  


class pe3 {
    public static void main(String args[] ) throws OutOfRangeException {
    
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};

        for(int i=0;i<str.length;i++){
            System.out.println(str[i].replaceAll("[aeiouAEIOU]", ""));
        }
    }
}
