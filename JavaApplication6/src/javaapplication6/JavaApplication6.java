/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Podaj nazwe pliku");
        String fileName = "";
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication6.class.getName()).log(Level.SEVERE, null, ex);
        }
	BufferedReader br = new BufferedReader(fr);
    }
    
}
