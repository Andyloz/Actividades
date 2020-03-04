/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import daw.dawutils.ReadScanner;
import java.util.ArrayList;

/**
 *
 * @author lozan
 */
public class E13 {
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        do {            
            nums.add(ReadScanner.ReadInt(0, 20));
        } while (nums.get(nums.size()-1) != 0);
        
        nums.remove(nums.size()-1);
        
        String var;
        for (int i = 0; i < nums.size(); i++) {
            var = (i+1)+": ";
            for (int j = 0; j < nums.get(i); j++) {
                var+= "*";
            }
            System.out.println(var);
        }
    }
}
