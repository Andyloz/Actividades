/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author andyloz
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int widthArrays = 0;
        
        // Pedir longitud de arrays
        System.out.print("Longitud de array: ");
        do {
            try {
                widthArrays = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un número válido: ");
            }
        } while (widthArrays <= 0);
        System.out.println();
        
        // Inicializar array
        int array[] = new int[widthArrays];
        
        // Pedir valores por teclado
        boolean repeat;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número (posición "+i+"): ");
            do {
                repeat = false;
                try {
                    array[i] = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.print("Introduzca un número válido: ");
                    repeat = true;
                }
            } while (repeat);
            System.out.println();
        }
        
        // Imprimir asteriscos
        String msg;
        for (int i : array) {
            msg = "";
            for (int j = 0; j < i; j++) {
                msg += "*";
            }
            System.out.println(msg);
        }
    }
}
