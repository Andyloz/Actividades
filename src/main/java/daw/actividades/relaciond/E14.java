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
public class E14 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] nums = new int[50][50];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(900)+100;
            }
        }
        System.out.println(E12.leerMatrizInts(nums));
        
        int buffer = 0;
        int contador = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                buffer += nums[i][j];
                contador++;
            }
        }
        System.out.println("Media: "+(buffer / contador));
        
        buffer = Integer.MAX_VALUE;
        int buffer2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
            // Menor
            if (nums[i][0] < buffer) {
                buffer = nums[i][0];
            }
            // Mayor
            if (nums[i][nums[i].length-1] > buffer2) {
                buffer2 = nums[i][nums[i].length-1];
            }
        }
        System.out.println("Mínimo: "+buffer);
        System.out.println("Máximo: "+buffer2);
    }
}
