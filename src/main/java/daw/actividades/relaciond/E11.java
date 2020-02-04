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
public class E11 {
    private static void sequentialSearch(int array[], int search) {
        for (int i : array) {
            if (i == search) {
                System.out.println("Encontrado!!");
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }
    
    private static void busquedaBinaria(int array[], int buscar) {
        if (Arrays.binarySearch(array, buscar) != -1) {
            System.out.println("[Búsqueda binaria] Se ha encontrado!!");
        } else {
            System.out.println("[Búsqueda binaria] No se ha encontrado.");
        }
    }
    
    public static void main(String[] args) {
        int array[] = {1,5,7,10,17,20};
        int search = 16;
        
        sequentialSearch(array, search);
        
        // Ordenar quick
        Random random = new Random();
        int array2[] = {
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1,
            random.nextInt(19)+1
        };
        System.out.println("Desordenado: "+Arrays.toString(array2));
        
        Arrays.sort(array2);
        System.out.println("Ordenado: "+Arrays.toString(array2));
        
        
        busquedaBinaria(array2, 10);
    }
}
