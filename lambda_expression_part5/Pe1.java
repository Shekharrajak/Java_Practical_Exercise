import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogManager;

import java.io.FileInputStream;
import java.io.IOException;


/*

1. Create a class with a non-default constructor (one with arguments) 
and no default constructor (no "no-arg" constructor). Create a second class
 that has a method that returns a reference to an object of the first 
class.Create the object that you return by making an anonymous inner 
class that inherits from the first class. 

*/


public class Pe1{
	
	// Constructor
	public Pe1(){
		
	}

	public Pe1(String s){
		anotherClass an = new anotherClass();
		// System.out.println("pe1 const");
		Inner in = an.get_class();
		in.get();
	}

	public static void main(String[] args){
		Logger logger = Logger.getLogger(Pe1.class.getName());
		logger.setLevel(Level.FINE);

		try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
        } catch (SecurityException | IOException e1) {
            e1.printStackTrace();
        }
        logger.setLevel(Level.FINE);
        logger.addHandler(new ConsoleHandler());
        //adding custom handler
        logger.addHandler(new MyHandler());
        try {
            //FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("/tmp/logger.log", 2000, 5);
            fileHandler.setFormatter(new MyFormatter());
            //setting custom filter for FileHandler
            // fileHandler.setFilter(new MyFilter());
            logger.addHandler(fileHandler);
            
            for(int i=0; i<1000; i++){
                //logging messages
                logger.log(Level.INFO, "Msg"+i);
            }
            logger.log(Level.CONFIG, "Config data");
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

		
		Pe1 p = new Pe1("something");
	}
	
}