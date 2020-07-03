/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author rob-c
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    //La ventana inicie en el centro de la pantalla
    public void iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed (ActionEvent e){
        //Se utiliza "Integer.parseInt" por que necesitamos int y NO Strings
        model.setNumero1(Integer.parseInt (view.txtNum1.getText()));
        model.setNumero2(Integer.parseInt (view.txtNum2.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
    
}
