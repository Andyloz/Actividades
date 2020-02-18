/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andyloz
 */
public class E23 {
    ArrayList<Double> lista1;
    ArrayList<Double> lista2;

    public E23() {
        Random random = new Random();
        lista1 = new ArrayList<>();
        lista2 = new ArrayList<>();
        
        for (int i = 0; i < random.nextInt(11)+5; i++) {
            lista1.add(random.nextDouble() + random.nextInt(50)+50);
        }
        for (int i = 0; i < random.nextInt(11)+10; i++) {
            lista2.add(random.nextDouble() + random.nextInt(50)+50);
        }
    }
    
    public String imprimirListas() {
        String string = "";
        
        string += "Lista 1: ";
        for (Double double1 : lista1) {
            string += double1+" ";
        }
        string += "\n";
        
        string += "Lista 2: ";
        for (Double double2 : lista2) {
            string += double2+" ";
        }
        string += "\n";
        return string;
    }
    
    public ArrayList<Double> noEstanEnLista1() {
        ArrayList<Double> lista3 = new ArrayList<>();
        
        for (Double double1 : lista1) {
            if (!lista2.contains(double1)) {
                lista3.add(double1);
            }
        }
        
        return lista3;
    }
    
    public String imprimirNoEstanEnLista1() {
        String string = "Lista 3: ";
        for (Double double1 : noEstanEnLista1()) {
            string += double1.toString()+" ";
        }
        return string;
    }
    
    public static void main(String[] args) {
        E23 a = new E23();
        System.out.println(a.imprimirListas());
        System.out.println(a.imprimirNoEstanEnLista1());
    }
}
