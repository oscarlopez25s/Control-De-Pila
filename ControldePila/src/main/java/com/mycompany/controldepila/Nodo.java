/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldepila;

/**
 *
 * @author alumno26
 */
public class Nodo {
   private int dato;
   Nodo sig;

    public Nodo(int dato) {
        this.dato = dato;
         sig = null;
    }

    public Nodo() {
    }
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "dato";
    }
   

    
    
    
}

        
