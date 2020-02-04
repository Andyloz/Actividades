/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import daw.dawutils.ReadScanner;
import java.util.Arrays;

/**
 *
 * @author andyloz
 */
public class E17 {
    public static void main(String[] args) {
        System.out.print("Introduzca un String: ");
        String string = ReadScanner.readString();
        
        char characters[] = string.toCharArray();
        Arrays.sort(characters);
    }
}
