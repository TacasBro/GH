/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author student
 */
public class CountWords {
    
    public CountWords() {}
    
    public static Integer count(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }
    
}
