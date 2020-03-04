/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.Random;

/**
 *
 * @author lozan
 */
public class E12 {
    
    static String leerMatrizInts(int[][] ints) {
        String string = "";
        
        for (int[] arrayInts : ints) {
            for (int i : arrayInts) {
                string += i+" ";
            }
            string += "\n";
        }
        
        return string;
    }
    
    static String leerMatrizChars(char[][] chars) {
        String string = "";
        
        for (char[] arrayChar : chars) {
            for (char c : arrayChar) {
                string += c+" ";
            }
            string += "\n";
        }
        
        return string;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        
        char[][] chars = new char[2][3];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = (char) (random.nextInt(26)+97);
            }
        }
        System.out.println(leerMatrizChars(chars));
    }
}
