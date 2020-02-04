/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author lozan
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        double array[] = new double[20];
        
        // Rellena con doubles de 7.5
        Arrays.fill(array, 7.5);
        
        // Copia de array
        double array2[] = array.clone();
        
        // Comparar ambos arrays
        System.out.println(array.equals(array2));
        
        Random random = new Random();
        array[random.nextInt(array.length)] = 6.3;
        
        // Imprmir arrays
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        
        // Comparar ambos arrays
        System.out.println(array.equals(array2));
    }
}
