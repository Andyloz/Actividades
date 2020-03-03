/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.actividades.relaciond;

import java.util.ArrayList;

/**
 *
 * @author andyloz
 */
public class E25 {

    ArrayList<Character> chars;
    int size;
    
    public E25(int size) {
        chars = new ArrayList<>();
        this.size = size;
    }
    
    public void push(char character) {
        if (chars.size() == size) {
            throw new ArrayIndexOutOfBoundsException("Full stack");
        } else {
            chars.add(character);
        }
    }
    
    public char pop() {
        return chars.remove(chars.size()-1);
    }
    
    public boolean isEmpty() {
        return chars.isEmpty();
    }
    
    public boolean isFull() {
        return size == chars.size(); 
        
        
        
        
        
        
    }
    
    public int size() {
        return chars.size();
    }
    
    @Override
    public String toString() {
        String string = "";
        
        for (int i = chars.size()-1; i >= 0; i--) {
            string += chars.get(i)+"\n";
        }
        
        return string;
    }
    
    public static void main(String[] args) {
        E25 a = new E25(3);
        a.push('a');
        a.push('b');
        a.push('c');
        System.out.println(a.toString());
        System.out.println(a.pop());
        System.out.println("");
        System.out.println(a.toString());
    }
}
