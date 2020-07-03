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
public class Pez extends Animal{
    private String alimentacion;

    public String getAlimentacion() {
        System.out.println("El pez está comiendo");
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    @Override
    public void printMensaje(){
        System.out.println("Soy un animal de tipo pez");
    }
}