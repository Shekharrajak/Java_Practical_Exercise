
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// pe 6
class pe6 {

    public static void main(String args[] )  {
        // Scanner sc = new Scanner(System.in);
        String str = "She sells seashells by the seashore"; //sc.nextLine();
        System.out.println(str);
        for(int i=0;i<20;i++){System.out.print(i);}
        String pt = "se";
        Matcher m = Pattern.compile(pt, Pattern.CASE_INSENSITIVE).matcher(str);

        while(m.find()){
        	System.out.println("\n" + pt + " pattern found at start" + m.start() + " and end at " + m.end());
        }
    }
}
