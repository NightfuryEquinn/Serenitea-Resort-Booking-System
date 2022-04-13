package com.University.JavaProjects.Java_Assignment;

import com.toedter.calendar.JDateChooser;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OOP_Normal_History 
{
    // OOP Normal Method - Search and Display
    void search(String searchName, JTable table)
    {
        try
        {
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

            String[][] tempData = new String[lineLength][12];

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
                else if(searchName.equals(""))
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
                String[] rowData = new String[] {tempData[i][0], tempData[i][1], tempData[i][5], tempData[i][6]};
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
    void viewSelected(String room, String name, String checkin, JTextField roomID, JTextField customerName, JTextField IC, JTextField contact, JTextField email, JTextField checkinDate, JDateChooser checkoutDate, JTextField stay, JTextField bP, JTextField tT, JTextField sT, JTextField tP)
    {
        try
        {
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

            String[][] tempData = new String[lineLength][12];

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
                if((tempData[i][0].equals(room)) && (tempData[i][1].equals(name)) && (tempData[i][5].equals(checkin)))
                {
                    // Convert String to Date
                    SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
                    Date tempDataDate;
                    try 
                    {
                        tempDataDate = dmyFormat.parse(tempData[i][6]);
                        
                        roomID.setText(tempData[i][0]);
                        customerName.setText(tempData[i][1]);
                        IC.setText(tempData[i][2]);
                        contact.setText(tempData[i][3]);
                        email.setText(tempData[i][4]);
                        checkinDate.setText(tempData[i][5]);
                        checkoutDate.setDate(tempDataDate);
                        stay.setText(tempData[i][7]);
                        bP.setText(tempData[i][8]);
                        tT.setText(tempData[i][9]);
                        sT.setText(tempData[i][10]);
                        tP.setText(tempData[i][11]);
                    } 
                    catch(ParseException e) 
                    {
                        System.out.print("Error 1-2");
                    }
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
    
    // OOP Normal Method - Count new days of stay and price
    void editSelected(String cIC, String cContact, String cEmail, String checkin, String checkout, JTextField IC, JTextField contact, JTextField email, JTextField stay, JTextField bP, JTextField tT, JTextField sT, JTextField tP)
    {
        try
        {
            // Convert string to date
            SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date checkinDate = dmyFormat.parse(checkin);
            Date checkoutDate = dmyFormat.parse(checkout);

            // Calculate new days of stay
            long daysOfStay = checkoutDate.getTime() - checkinDate.getTime();
            long convertTime = TimeUnit.DAYS.convert(daysOfStay, TimeUnit.MILLISECONDS);

            String newStay = String.valueOf(convertTime);

            // Calculate new prices
            int nBP = Integer.parseInt(newStay) * 350;
            int nTT = Integer.parseInt(newStay) * 10;
            int nST = (int) (nBP * 0.1);
            int nTP = nBP + nTT + nST;

            String basePrice = String.valueOf(nBP);
            String tourTax = String.valueOf(nTT);
            String serviceTax = String.valueOf(nST);
            String totalPrice = String.valueOf(nTP);
            
            // Set textfield to new values
            IC.setText(cIC);
            contact.setText(cContact);
            email.setText(cEmail);
            stay.setText(newStay);
            bP.setText(basePrice);
            tT.setText(tourTax);
            sT.setText(serviceTax);
            tP.setText(totalPrice);
        }
        catch(NumberFormatException | ParseException e)
        {
            System.out.println("Error 3");
        }
    }
    
    // OOP Normal Method - Update
    void update(String room, String name, String checkin, JTextField IC, JTextField contact, JTextField email, JDateChooser checkoutDate, JTextField stay, JTextField bP, JTextField tT, JTextField sT, JTextField tP)
    {
        try
        {
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

            String[][] tempData = new String[lineLength][12];

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
            
            // Replace old data with edited data
            for(int i = 0; i < tempData.length; i++)
            {
                if((tempData[i][0].equals(room)) && (tempData[i][1].equals(name)) && (tempData[i][5].equals(checkin)))
                {
                    try
                    {
                        // Convert String to Date
                        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
                        
                        Date x = checkoutDate.getDate();
                        String tempDataDate = dmyFormat.format(x);

                        tempData[i][2] = IC.getText();
                        tempData[i][3] = contact.getText();
                        tempData[i][4] = email.getText();
                        tempData[i][6] = tempDataDate;
                        tempData[i][7] = stay.getText();
                        tempData[i][8] = bP.getText();
                        tempData[i][9] = tT.getText();
                        tempData[i][10] = sT.getText();
                        tempData[i][11] = tP.getText();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error 3-4");
                    }
                }
            }
            
            // Write File
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            // Clear exisitng data in file
            bw.flush();

            // For loop old and new data back into the file
            for(int i = 0; i < tempData.length; i++)
            {
                for(int j = 0; j < 12; j++)
                {
                    if(j != 11)
                    {
                        bw.write(tempData[i][j] + " | ");
                    }
                    else
                    {
                        bw.write(tempData[i][j]);
                        bw.write("\n");
                    }
                }
            }
            
            // Close all file
            br.close();
            lnr.close();
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error 4");
        }
        
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
                
                for(int i = 0; i < fileData.length; i++)
                {
                    tempData[pass][i] = fileData[i];
                }

                pass++;
            }
            
            // Replace old data with edited data
            for(int i = 0; i < tempData.length; i++)
            {
                if((tempData[i][0].equals(room)) && (tempData[i][1].equals(name)) && (tempData[i][4].equals(checkin)))
                {
                    try
                    {
                        // Convert String to Date
                        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
                        
                        Date x = checkoutDate.getDate();
                        String tempDataDate = dmyFormat.format(x);
                        
                        tempData[i][5] = tempDataDate;
                        tempData[i][6] = stay.getText();
                        tempData[i][7] = bP.getText();
                        tempData[i][8] = tT.getText();
                        tempData[i][9] = sT.getText();
                        tempData[i][10] = tP.getText();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error 4-5");
                    }
                }
            }
            
            // Write File
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            // Clear exisitng data in file
            bw.flush();

            // For loop old and new data back into the file
            for(int i = 0; i < tempData.length; i++)
            {
                for(int j = 0; j < 11; j++)
                {
                    if(j != 10)
                    {
                        bw.write(tempData[i][j] + " | ");
                    }
                    else
                    {
                        bw.write(tempData[i][j]);
                        bw.write("\n");
                    }
                }
            }
            
            // Close all file
            br.close();
            lnr.close();
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error 5");
        }
    }
    
    // OOP Normal Method - Delete
    void delete(String room, String name, String checkin)
    {
        try
        {
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

            String[][] tempData = new String[lineLength][12];

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
            
            // Create Array in Array without Deleted Data
            String[][] newTempData = new String[lineLength][12];
            
            for(int i = 0; i < tempData.length; i++)
            {
                if((tempData[i][0].equals(room)) && (tempData[i][1].equals(name)) && (tempData[i][5].equals(checkin)))
                {
                    // Pass 
                }
                else
                {
                    for(int j = 0; j < tempData[i].length; j++)
                    {
                        newTempData[i][j] = tempData[i][j];
                    }
                }
            }
            
            // Write File
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            // Clear exisitng data in file
            bw.flush();

            // For loop old and new data back into the file
            for(int i = 0; i < newTempData.length; i++)
            {
                for(int j = 0; j < 12; j++)
                {
                    if(newTempData[i][j] != null)
                    {
                        if(j != 11)
                        {
                           bw.write(newTempData[i][j] + " | ");
                        }
                        else
                        {
                            bw.write(newTempData[i][j]);
                            bw.write("\n");
                        }
                    }
                }
            }
            
            // Close all file
            br.close();
            lnr.close();
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error 6");
        }
        
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

                for(int i = 0; i < fileData.length; i++)
                {
                    tempData[pass][i] = fileData[i];
                }

                pass++;
            }
            
            // Create Array in Array without Deleted Data
            String[][] newTempData = new String[lineLength][11];
            
            for(int i = 0; i < tempData.length; i++)
            {
                if((tempData[i][0].equals(room)) && (tempData[i][1].equals(name)) && (tempData[i][4].equals(checkin)))
                {
                    // Pass 
                }
                else
                {
                    for(int j = 0; j < tempData[i].length; j++)
                    {
                        newTempData[i][j] = tempData[i][j];
                    }
                }
            }
            
            // Write File
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            // Clear exisitng data in file
            bw.flush();

            // For loop old and new data back into the file
            for(int i = 0; i < newTempData.length; i++)
            {
                for(int j = 0; j < 11; j++)
                {
                    if(newTempData[i][j] != null)
                    {
                        if(j != 10)
                        {
                           bw.write(newTempData[i][j] + " | ");
                        }
                        else
                        {
                            bw.write(newTempData[i][j]);
                            bw.write("\n");
                        }
                    }
                }
            }
            
            // Close all file
            br.close();
            lnr.close();
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error 7");
        }
    }
}
