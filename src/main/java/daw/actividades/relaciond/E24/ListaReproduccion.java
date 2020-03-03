/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond.E24;

import java.util.ArrayList;

/**
 *
 * @author andyloz
 */
public class ListaReproduccion {
    private ArrayList<Cancion> lista;

    public ListaReproduccion(ArrayList<Cancion> lista) {
        this.lista = lista;
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }
    
    public int numeroCanciones() {
        return lista.size();
    }
    
    public boolean estaVacia() {
        return lista.isEmpty();
    }
    
    public Cancion escucharCancion(int index) {
        return lista.get(index);
    }
    
    public void cambiarCancion(int index, Cancion cancion) {
        lista.set(index, cancion);
    }
    
    public void grabarCancion(Cancion cancion) {
        lista.add(cancion);
    }
    
    public void eliminarCancion(int index) {
        lista.remove(index);
    }
    
    public String imprimirLista() {
        return null;
    }
}
