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
 * @author andyloz
 */
public class Ejercicio9 {
    static void sequentialSearch(int array[], int search) {
        for (int i : array) {
            if (i == search) {
                System.out.println("Encontrado!!");
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }
    
    static void ordenarBubble(int[] arrayOrdenar) {
        int tmp;
        for (int i = 0; i < arrayOrdenar.length - 1; i++)
            for (int j = i + 1; j < arrayOrdenar.length; j++)
                if (arrayOrdenar[i] > arrayOrdenar[j]) {
                    tmp = arrayOrdenar[i];
                    arrayOrdenar[i] = arrayOrdenar[j];
                    arrayOrdenar[j] = tmp;
                }
    }
    
    public static void main(String[] args) {
        // Valores
        int array[] = {1,5,7,10,17,20};
        int search = 16;
        
        sequentialSearch(array, search);
        
        if (Arrays.binarySearch(array, search) != -1) {
            System.out.println("[Clase Arrays] Se ha encontrado!!");
        } else {
            System.out.println("[Clase Arrays] No se ha encontrado.");
        }
        
        Random random = new Random();
        // Bubble sort
        int array2[] = {
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1
        };
        
        ordenarBubble(array2);
        System.out.println(Arrays.toString(array2));
    }
}
