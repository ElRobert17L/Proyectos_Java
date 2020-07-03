/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.rlr.ejemploestatico;

/**
 *
 * @author rob-c
 */
public class Persona {

    private int idPersona;
    private String nombre;
    private int contadorPersonas; //se asocia con clase

    //Constructor
    public Persona(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

//    public void setIdPersona(int idPersona) {
//        this.idPersona = idPersona;
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", contadorPersonas=" + contadorPersonas +'}';
    }

}
