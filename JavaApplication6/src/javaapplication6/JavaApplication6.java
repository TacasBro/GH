
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
        final String dir = System.getProperty("user.dir");
        String path = dir+ "\\src\\javaapplication6\\pliki/";
     try 
     {
        fr = new FileReader(path+fileName);
        BufferedReader br = new BufferedReader(fr);
        String currentLine = "";
        
        while((currentLine=br.readLine())!=null)
                {
                    suma += CountWords.count(currentLine);
                }
        
     } 
     catch (FileNotFoundException e)
     {
         System.out.println("NI MA TAKIEGO");
     }
     catch (Exception e) 
     {
           System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
     }
     
     
     System.out.println(suma);

    }
}
