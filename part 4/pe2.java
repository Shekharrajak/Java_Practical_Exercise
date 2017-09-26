
import java.util.HashMap;
import java.util.Map;

import  java.util.regex.Pattern;
import  java.util.regex.Matcher;

class pe2 {
    public static void main(String args[] ) {
        String str = "one one -one___two,,three,one @three*one?two";

        String pt = "([a-zA-Z0-9]+)";
        Matcher m = Pattern.compile(pt).matcher(str);

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        while(m.find()){
        	// System.out.println("ss");
            	// System.out.println(m.group(0));
            
            // int val = hm.get(m.group(0));
            if(hm.containsKey(m.group(0))){
            	hm.put(m.group(0),hm.get(m.group(0)) + 1);
            	// System.out.println(hm.get(m.group()));
            }
            else{
            	hm.put(m.group(0), 1);
            	// System.out.println(hm.get(m.group()));
            }
            
        }

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
        	String s = entry.getKey();
        	int count = entry.getValue();
        	System.out.println(s + " : " + count);
        }
    }
}
