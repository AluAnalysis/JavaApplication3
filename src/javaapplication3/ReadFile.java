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

public class ReadFile {

    private String path;

    public ReadFile(String file_path)
    {
        path = file_path;
    }

    public int readLine() throws IOException
    {
        FileReader fr = new FileReader(path);
        BufferedReader bf = new BufferedReader(fr);

        int numberoflines = 0;

        while ((bf.readLine()) != null)
        {
            numberoflines++;
        }
        return numberoflines;
    }

    public String[] openFile() throws IOException
    {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberoflines = readLine();
        String[] textData = new String[numberoflines];

        for(int i = 0;i<numberoflines;i++)
        {
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;
    }

}
