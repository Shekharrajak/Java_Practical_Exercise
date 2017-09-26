
import java.util.*;

import  java.util.regex.Pattern;
import  java.util.regex.Matcher;

class pe3 {
    public static void main(String args[] ) {
        String arr[] = {"a","b","c","d","a","c","c"};
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
        Set<String> s = new HashSet<String>(al);
        for(String str : s){
            // Integer.parseInt(Collections.frequency(al,str))
        	System.out.println(str + " : " + (Collections.frequency(al,str) >= 2));
        }
    }
}
