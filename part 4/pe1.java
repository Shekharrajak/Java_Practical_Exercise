
import java.util.*;
import java.util.ArrayList;


class Pe1 {
    public static void main(String args[] ) {
        String[] str_arr = {"Ram", "krishana", "Shyam"};
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(str_arr));

        Iterator it = al.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
