
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rob-c
 */
public class PruebaPersonas {
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Scanner sc = new Scanner(System.in);
        
        p1.nombre = "Roberto";
        p1.apellido = "Ledesma";
        
        p1.desplegarNombre();

    }
}
