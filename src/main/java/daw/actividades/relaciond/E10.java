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
public class E10 {
    private static void sequentialSearch(int array[], int search) {
        for (int i : array) {
            if (i == search) {
                System.out.println("Encontrado!!");
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }
    
    private static void ordenarQuick(int[] arrayOrdenar) {
        Arrays.sort(arrayOrdenar);
    }
    
    public static void main(String[] args) {
        int array[] = {1,5,7,10,17,20};
        int search = 16;
        
        sequentialSearch(array, search);
        
        if (Arrays.binarySearch(array, search) != -1) {
            System.out.println("[Clase Arrays] Se ha encontrado!!");
        } else {
            System.out.println("[Clase Arrays] No se ha encontrado.");
        }
        
        // Ordenar quick
        Random random = new Random();
        int array2[] = {
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1
        };
        
        ordenarQuick(array2);
        System.out.println("Ordenar quick: "+Arrays.toString(array2));
    }
}
