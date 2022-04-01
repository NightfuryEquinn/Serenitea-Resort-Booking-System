package com.University.JavaProjects.Java_Assignment;

import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OOP_Normal_Receipt 
{
    // OOP Normal Method - Search and Display
    void search(String searchName, JTable table)
    {
        try
        {
            File f = new File("Customer_Receipt.txt");
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

            String[][] tempData = new String[lineLength][11];

            String line;

            // For Loop Exisiting Data into Array in Array
            int pass = 0;

            while((line = br.readLine()) != null)
            {
                fileData = line.split("\\s\\|\\s");
                
                if(fileData[1].equals(searchName))
                {
                    for(int i = 0; i < fileData.length; i++)
                    {
                        tempData[pass][i] = fileData[i];
                    }
                    
                    pass++;
                }
            }
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            for(int i = 0; i < tempData.length; i++)
            {
                String[] rowData = new String[] {tempData[i][0], tempData[i][1], tempData[i][4], tempData[i][5]};
                model.addRow(rowData);
            }
            
            br.close();
            lnr.close();
        }
        catch(IOException e)
        {
            System.out.println("Error 1");
        }
    }
    
    // OOP Normal Method - Display full data from file
    void viewSelected(String room, String name, String checkin, JTextField roomID, JTextField customerName, JTextField adminName, JTextField paymentDate, JTextField checkinDate, JTextField checkoutDate, JTextField stay, JTextField bP, JTextField tT, JTextField sT, JTextField tP)
    {
        try
        {
            File f = new File("Customer_Receipt.txt");
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

            String[][] tempData = new String[lineLength][11];

            String line;
            
            // For Loop Exisiting Data into Array in Array
            int pass = 0;

            while((line = br.readLine()) != null)
            {
                fileData = line.split("\\s\\|\\s");
                
                if(fileData[1].equals(name))
                {
                    for(int i = 0; i < fileData.length; i++)
                    {
                        tempData[pass][i] = fileData[i];
                    }
                    
                    pass++;
                }
            }
            
            for(int i = 0; i < tempData.length; i++)
            {
                if((tempData[i][0].equals(room)) && (tempData[i][1].equals(name)) && (tempData[i][4].equals(checkin)))
                {
                    roomID.setText(tempData[i][0]);
                    customerName.setText(tempData[i][1]);
                    adminName.setText(tempData[i][2]);
                    paymentDate.setText(tempData[i][3]);
                    checkinDate.setText(tempData[i][4]);
                    checkoutDate.setText(tempData[i][5]);
                    stay.setText(tempData[i][6]);
                    bP.setText(tempData[i][7]);
                    tT.setText(tempData[i][8]);
                    sT.setText(tempData[i][9]);
                    tP.setText(tempData[i][10]);
                }
            }
            
            br.close();
            lnr.close();
        }
        catch(IOException e)
        {
            System.out.println("Error 2");
        }
    }
}
