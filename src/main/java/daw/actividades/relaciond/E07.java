/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andyloz
 */
public class E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int longArrays = 0;
        
        // Pedir longitud de arrays
        System.out.print("Longitud de arrays: ");
        do {
            try {
                longArrays = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un número válido: ");
            }
        } while (longArrays <= 0);
        System.out.println();
        
        // Inicializar arrays
        int array1[] = new int[longArrays];
        int array2[] = new int[longArrays];
        
        // Rellenar de números los arrays
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(99)+1;
            array2[i] = random.nextInt(99)+1;
        }
        
        int array1ByArray2[] = new int[longArrays];
        // Multiplicar valores de arrays
        for (int i = 0; i < array1.length; i++) {
            array1ByArray2[i] = array1[i] * array2[i];
        }
        
        // Imprimir arrays
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1ByArray2));
    }
}
