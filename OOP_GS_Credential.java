package com.University.JavaProjects.Java_Assignment;

import java.io.*;

/**
* Get Admin Credential Files using OOP GetSet 
*/
public class OOP_GS_Credential 
{
    String x, y, rx, ry;
    void setCredential(String username, String password)
    {
        try
        {
            // Create New File
            File f = new File("Admin_Credential.txt");
            
            // Insert Default Admin Username and Password
            FileWriter fw = new FileWriter(f);
            fw.write("Admin | admin");
            fw.close();
            
            // Read File
            BufferedReader br = new BufferedReader(new FileReader("Admin_Credential.txt"));
            String credential;
            
            credential = br.readLine();
            
            String[] credentialArr = credential.split("\\s\\|\\s");
            
            // Admin Username and Password
            x = credentialArr[0];
            y = credentialArr[1];
            
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
    }
    
    String getUsername()
    {
        rx = x;
        return rx;
    }
    
    String getPassword()
    {
        ry = y;
        return ry;
    }
}
