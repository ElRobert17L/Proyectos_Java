/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author rob-c
 */
public class Main {
    
    public static void main (String [] args){
        Animal animal = new Animal();
        Animal animal2 = new Perro();
        Animal animal3 = new Pez();
        Animal animal4 = new Serpiente();
        
        animal.printMensaje();
        animal2.printMensaje();
        animal3.printMensaje();
        animal4.printMensaje();
    }
    
}
