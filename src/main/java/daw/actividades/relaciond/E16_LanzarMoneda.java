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
public class E16_LanzarMoneda {
    boolean[] results;

    public E16_LanzarMoneda(int times) {
        if (times > 0) {
            results = new boolean[times];
        } else {
            throw new IllegalArgumentException();
        }
    }

    void rellenar() {
        Random random = new Random();
        Arrays.fill(results, random.nextBoolean());
    }
    
    // Cara = true
    int caras() {
        int caras = 0;
        for (boolean result : results) {
            if (result) {
                caras++;
            }
        }
        return caras;
    }
    
    // Cruz = false
    int cruces() {
        int cruces = 0;
        for (boolean result : results) {
            if (!result) {
                cruces++;
            }
        }
        return cruces;
    }
    
    void imprimirResultados() {
        for (int i = 1; i < results.length +1; i++) {
            System.out.println(i+". "+results[i]);
        }
    }
}
