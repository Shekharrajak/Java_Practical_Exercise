
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;

public class pe20 {
    private static final String FILENAME = "filename.txt";

    public static void main(String args[] ) throws Exception {

        BufferedReader br = null;
        FileReader fr = null;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
    try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                String str[] = sCurrentLine.split("\\s+|\\.|\\,");
                for(String s: str){
                    // System.out.println(s);
                    if(hm.containsKey(s)){
                        hm.put(s, hm.get(s)+1);    
                    }
                    else{
                        hm.put(s, 1);     
                    }
                    
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        }
        finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        for(Map.Entry m:hm.entrySet()){  
           System.out.println(m.getKey()+" "+m.getValue());  
        }  

    }
}
