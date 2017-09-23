
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;

public class pe14 {
    private static final String FILENAME = "filename.txt";

    public static void main(String args[] ) throws Exception {

        BufferedReader br = null;
        FileReader fr = null;

    try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
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

    }
}
