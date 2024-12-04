/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.File;

public class A {

    public static void main(String[] args) {
       try {
            // Specify the file path in the C: drive
            String filePath = "C:\\NewFolder\\new_file.txt";

            // Create a File object for the directory and file
            File file = new File(filePath);

            // Ensure the directory exists, otherwise create it
            File folder = new File(file.getParent());
            if (!folder.exists()) {
                folder.mkdirs();  // Create the directory
                System.out.println("Directory created: " + folder.getAbsolutePath());
            }

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }


        } catch (IOException e) {
            System.out.println("error :" + e.getMessage());
        }
    }

}
