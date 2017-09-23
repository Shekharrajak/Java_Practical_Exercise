
import java.util.*;
import java.text.DateFormat;  
import java.util.Date;  


class pe2 {
    public static void main(String args[] ) throws OutOfRangeException {
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();
        // System.out.println(c);
        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println(c.getTime());
        // Print dates of the current week starting on Monday
        // for (int i = 0; i < 7; i++) {
        //     System.out.println(DateFormat.getDateInstance().format(c.getTime()));
        //     c.add(Calendar.DATE, 1);
        // }

        // last day
         c.add(Calendar.DATE, 6);
         System.out.println(c.getTime());
    }
}
