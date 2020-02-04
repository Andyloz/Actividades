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
public class E06 {
    
    private static String arraysToString(int[] array1, int[] array2) {
        int aux[][] = {array1, array2};
        String msg = "";
        for (int[] array : aux) {
            msg += "[";
            for (int i = 0; i < array.length; i++) {
                msg += array[i];
                if (i != array.length -1) {
                    msg += ",";
                }
            }
            msg += "]";
        } return msg;
    }
    
    private static void compararArrays(int[] array1, int[] array2) {
        String msg = arraysToString(array1, array2);
        
        if (Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales: "+msg);
        } else {
            System.out.println("Los arrays son diferentes: "+msg);
        }
    }
    
    private static void compararArraysManual(int[] array1, int[] array2) {
        String msg = arraysToString(array1, array2);
        
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    System.out.println("[Manual] Los arrays son diferentes: "+msg);
                    return;
                }
            }
            System.out.println("[Manual] Los arrays son iguales: "+msg);
        } else {
            System.out.println("[Manual] Los arrays son diferentes: "+msg);
        }
    }
    
    public static void main(String[] args) {
        int array123[] = {1,2,3};
        int array1234[] = {1,2,3,4};
        int array122[] = {1,2,2};
        
        compararArrays(array123, array123);
        compararArrays(array1234, array123);
        compararArrays(array123, array122);
        System.out.println();
        
        compararArraysManual(array123, array123);
        compararArraysManual(array1234, array123);
        compararArraysManual(array123, array122);
    }
}
