
package javaapplication6;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javaapplication6.CountWords;


public class JavaApplication6 {


    public static void main(String[] args){
        System.out.println("Podaj nazwe pliku");
        String fileName = "";
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();
        FileReader fr= null;
        int suma = 0;
//        String daw1 = "C:\\Users\\student\\Desktop/heh.txt";
     try 
     {
        fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String currentLine = "";
        
        while((currentLine=br.readLine())!=null)
                {
                    suma += CountWords.count(currentLine);
                }
        
     } 
     catch (Exception e) 
     {
           System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
     }
     
     System.out.print(suma);

    
}
