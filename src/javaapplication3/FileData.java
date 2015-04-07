/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author Arsalan
 */

import java.io.*;

public class FileData {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)throws IOException {
        // TODO code application logic here

        String file_name = "C:\\Users\\Arsalan\\Documents\\NetBeansProjects\\JavaApplication3\\text.txt";


        // reading from a file
        try {

            ReadFile file = new ReadFile(file_name);
            String[] aryLine = file.openFile();

            int i;

            for(i=0;i<aryLine.length;i++)
            {
                System.out.println(aryLine[i]);
            }

        }

        catch (IOException e){

            System.out.println(e.getMessage());

        }

        // writing to a file
        try{
        WriteFile data = new WriteFile(file_name,true);
        data.writeToFile("This is a random line appended to this file that already existed.");
        System.out.println("File has been written to");
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
