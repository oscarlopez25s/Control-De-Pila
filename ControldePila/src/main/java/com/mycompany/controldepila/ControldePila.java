/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.controldepila;

import javax.swing.JOptionPane;
/**
 *
 * @author alumno26
 */
public class ControldePila {

    public static void main(String[] args) {
       Pila p = new Pila();
       for (int i =0; i < 5; i++) {
           String V = JOptionPane.showInputDialog("Valor:");
           p.setPila(p.push(p.getPila(), Integer.valueOf(V)));
       }
}
}
