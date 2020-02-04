/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.Arrays;

/**
 *
 * @author andyloz
 */
public class Ejercicio4 {
    static void sequentialSearch(int array[], int search) {
        for (int i : array) {
            if (i == search) {
                System.out.println("Encontrado!!");
                return;
            }
        }
        System.out.println("No se ha encontrado.");
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
    }
}
