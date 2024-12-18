/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaLigada;

/**
 *
 * @author ALSOLIMA
 */
public class Elemento {
    private String valor;
    private Elemento proximo;
    
    public Elemento(String novoValor) {
        this.valor = novoValor;   
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the proximo
     */
    public Elemento getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
    
    
}
