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
public class Perro extends Animal{
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
 
        this.raza = raza;
    }
    
    @Override
    public void printMensaje(){
        System.out.println("Soy un animal de tipo perro");
    }
    
}
