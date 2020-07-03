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
public class Serpiente extends Animal{
    private boolean venenosa;

    public boolean isVenenosa() {
        System.out.println("La serpiente está comiendo");
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }
    
    @Override
    public void printMensaje(){
        System.out.println("Soy un animal de tipo serpiente");
    }
}
