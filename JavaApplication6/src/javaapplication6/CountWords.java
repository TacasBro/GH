
package javaapplication6;

public class CountWords {
    
    public CountWords() {}
    
    public static Integer count(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }
    
}
