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

public class WriteFile {

    private String path;
    private boolean append_to_file = false;

    // First Constructor
    public WriteFile(String file_path)
    {
        path = file_path;
    }

    // Second Constructor
    public WriteFile(String file_path, boolean append_value)
    {
        path = file_path;
        append_to_file = append_value;
    }

    //writing to a file
    public void writeToFile(String textline) throws IOException
    {
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        print_line.println(textline);
        print_line.close();
    }
}
