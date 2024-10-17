/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

import java.util.Objects;

/**
 *
 * @author ALSOLIMA
 */
public class Animais {

    private String especie;

    public Animais(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
         return especie;
     }

 public void setEspecie(String especie) {
        this.especie = especie;
    }

     

public boolean equals(Object obj) {
    Animais outro = (Animais) obj;
    return outro.getEspecie().equals(this.getEspecie());
}

    /**
     *
     * @return
     */
    @Override
    public String toString() {
    return getEspecie();
 }
}
    
   

