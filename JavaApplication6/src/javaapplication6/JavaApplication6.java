
package javaapplication6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaApplication6 {

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
