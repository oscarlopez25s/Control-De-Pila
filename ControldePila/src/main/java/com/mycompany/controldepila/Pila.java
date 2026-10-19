/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldepila;

/**
 *
 * @author alumno26
 */
public class Pila {
    
    Nodo pila;

    public Pila() {
    }

    public Pila(Nodo pila) {
        this.pila = pila;
    }

    public Nodo getPila() {
        return pila;
    }

    public void setPila(Nodo pila) {
        this.pila = pila;
    }
    
    public Nodo push(Nodo p, int d) { 
       if(p == null){
           Nodo nuevo=new Nodo(d);
           p = nuevo; 
       } else {
           p = push(p.getSig(),d);
       }
       return p;
   } 
    
     public String printPila(Nodo p){
         if (p == null){
             return "";
         }else{
             return p.toString()+printPila(p.getSig());
     }
}
}  
