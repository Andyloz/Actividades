/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lozan
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numPersonas = 0;
        System.out.println("Media de altura");
        System.out.println("---------------");
        System.out.print("¿Cuántas personas vamos a medir?: ");
        do {            
            try {
                numPersonas = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Introduzca un valor válido: ");
            } finally {
                sc.nextLine();
            }
        } while (numPersonas == 0.0);
        System.out.println();
        
        double alturas[] = new double[numPersonas];
        
        // Medir personas
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Medida de persona "+(i+1)+" en cm (decimales con coma): ");
            do {            
                try {
                    alturas[i] = Math.abs(sc.nextDouble());
                } catch (InputMismatchException e) {
                    System.out.print("Introduzca un valor válido: ");
                } finally {
                    sc.nextLine();
                }
            } while (alturas[i] == 0.0);
        }
        System.out.println();
        
        double media = 0;
        
        
        // Sumatorio de alturas
        for (double altura : alturas) {
            media += altura;
        }
        // División para media
        media /= numPersonas;
        
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("La media de altura es de "+df.format(media));
        System.out.println();
        
        
        int supMedia = 0;
        int infMedia = 0;
        
        // Averiguar cuántos superan y están por debajo de la media
        for (double altura : alturas) {
            if (altura > media) {
                supMedia++;
            } else if (altura < media) {
                infMedia++;
            }
        }
        
        if (supMedia == 1) {
            System.out.println("1 sola persona esta por encima de la media");
        } else {
            System.out.println(supMedia+" personas están por encima de la media");
        }
        
        if (infMedia == 1) {
            System.out.println("1 sola persona esta por debajo de la media");
        } else {
            System.out.println(infMedia+" personas están por debajo de la media");
        }
    }
}
