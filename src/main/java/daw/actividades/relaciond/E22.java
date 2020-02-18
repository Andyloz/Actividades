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
public class E22 {
    private ArrayList<Integer> lista;

    public E22() {
        Random random = new Random();
        lista = new ArrayList<>();
        int length = random.nextInt(100);
        
        for (int i = 0; i < length; i++) {
            lista.add(random.nextInt(90)+11);
        }
    }
    
    public String imprimirLista() {
        String string = "";
        int i = 0;
        while (true) {
            for (int j = 0; j < 5; j++) {
                if ( i > lista.size() - 1) {
                    return string;
                }
                string += lista.get(i)+"\t";
                i++;
            }
            string += "\n";
        }
    }
    
    public int imprimirSumaPares() {
        ArrayList<Integer> pares = new ArrayList<>();
        
        for (Integer integer : lista) {
            if (integer.doubleValue() % 2 == 0) {
                pares.add(integer);
            }
        }
        
        int suma = 0;
        for (Integer par : pares) {
            suma += par.doubleValue();
        }
        
        return suma;
    }
    
    public Integer elementoMayor() {
        Integer integer = lista.get(0);
        for (int i=  1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(integer) > 0) {
                integer = lista.get(i);
            }
        }
        return integer;
    }
    
    public Integer elementoMenor() {
        Integer integer = lista.get(0);
        for (int i=  1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(integer) < 0) {
                integer = lista.get(i);
            }
        }
        return integer;
    }
    
    public int getSize() {
        return lista.size();
    }
    
    public void borrarElemento(int posicion) {
        try {
            lista.remove(posicion);
        } catch (IndexOutOfBoundsException e) {
        }
    }
    
    public void borrarNumeros(int num) {
        boolean repeat = true;
        do {
            if (!lista.remove(Integer.valueOf(num))) {
                repeat = false;
            }
        } while (repeat);
    }
    
    public void modificarNumero(int index, int numero) {
        lista.set(index, numero);
    }
    
    public static void main(String[] args) {
        E22 a = new E22();
        System.out.println(a.imprimirLista());
        System.out.println("Suma pares: "+a.imprimirSumaPares());
        System.out.println("Elemento mayor: "+a.elementoMayor().toString());
        System.out.println("Elemento menor: "+a.elementoMenor().toString());
        System.out.println("Tamaño de la lista: "+a.getSize());
        a.borrarNumeros(99);
        System.out.println(a.imprimirLista());
    }
}
