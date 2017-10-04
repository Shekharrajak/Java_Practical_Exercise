
import java.util.*;


class Pe6 {
	public static void print_set(Set<String> set){
		for(String s : set){
        	System.out.println(s);
        }
        System.out.println();
	}
    public static void main(String args[] ) {
        String[] arr = {"Harry",  "Olive",  "Alice",  "Bluto",  "Eugene"};
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
        HashSet<String> set = new HashSet<String>(al);

        print_set(set);

        TreeSet<String> ts = new TreeSet<String>(set);

        print_set(ts);

    }
}
