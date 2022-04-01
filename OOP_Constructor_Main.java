package com.University.JavaProjects.Java_Assignment;

import java.io.*;

public class OOP_Constructor_Main 
{
    String[][] tempData;
    
    OOP_Constructor_Main()
    {
        try
        {
            // Get and read file
            File f = new File("Resort_History.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            
            // Get Number of Lines in File
            int lineLength = 0;

            LineNumberReader lnr = new LineNumberReader(new FileReader(f));

            while(lnr.readLine() != null) 
            {
                lineLength++;
            }

            lineLength = lnr.getLineNumber();

            // Create Array in Array
            String[] fileData;

            tempData = new String[lineLength][12];

            String line;

            // For Loop Exisiting Data into Array in Array
            int pass = 0;

            while((line = br.readLine()) != null)
            {
                fileData = line.split("\\s\\|\\s");

                for(int i = 0; i < fileData.length; i++)
                {
                    tempData[pass][i] = fileData[i];
                }

                pass++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    
    String[][] historyData()
    {
        return tempData;
    }
}
