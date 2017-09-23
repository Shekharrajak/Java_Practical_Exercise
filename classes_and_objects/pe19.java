
import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;

import java.lang.Object;

import java.util.*;

public class pe19 {
    // private static final String FILENAME = "filename.txt";

    public static void main(String args[] ) throws Exception {

    File folder = new File("../../");
    File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
          if (listOfFiles[i].isFile()) {
            String fname = listOfFiles[i].getName() ; 
            System.out.println("File " + listOfFiles[i].getName());
            // System.out.println("File " + listOfFiles[i].getName() + " extension is : " + FilenameUtils.getExtension(listOfFiles[i].getName()));
            System.out.println(
                "File " + fname+ " extension is : " + fname.substring(fname.lastIndexOf('.')+1));
          
          } else if (listOfFiles[i].isDirectory()) {
            System.out.println("Directory " + listOfFiles[i].getName());
          }
        }

    }
}
