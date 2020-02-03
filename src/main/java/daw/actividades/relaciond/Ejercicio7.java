/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andyloz
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int longArrays = 0;
        
        // Pedir longitud de arrays
        System.out.print("Longitud de arrays: ");
        System.out.println();
        do {
            try {
                longArrays = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un número válido: ");
            }
        } while (longArrays > 0);
        System.out.println();
        
        // Inicializar arrays
        int array1[] = new int[longArrays];
        int array2[] = new int[longArrays];
        
        // Rellenar de números los arrays
        for (int i : array1) {
            i = random.nextInt(99)+1;
            System.out.println(i);
        }
        for (int i : array2) {
            i = random.nextInt(99)+1;
        }
    }
}
