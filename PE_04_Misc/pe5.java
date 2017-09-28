
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// pe 5
class pe5 {

    public static void main(String args[] )  {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String pt = ".*harry.*";
        Matcher m = Pattern.compile(pt, Pattern.CASE_INSENSITIVE).matcher(str);

            System.out.println(str + " . Is Harry here ? " + m.matches());

    }
}
