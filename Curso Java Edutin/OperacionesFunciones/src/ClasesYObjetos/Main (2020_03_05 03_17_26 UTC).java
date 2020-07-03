/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author rob-c
 */
public class Main {
    public static void main (String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        Operacion op = new Operacion();
        
        op.suma(n1, n2);
        op.resta(n1, n2);
        op.multi(n1, n2);
        op.division(n1, n2);
        op.mostrarResultados();
    }
    
}
