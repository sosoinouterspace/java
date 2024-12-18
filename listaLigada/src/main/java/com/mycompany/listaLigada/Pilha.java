/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaLigada;

/**
 *
 * @author ALSOLIMA
 */
public class Pilha {
       private ListaLigada lista;
    
    public Pilha(){
        this.lista = new ListaLigada();
    }
    
    public void adicionar (String novoValor){
        this.lista.adicionarComeco(novoValor);
    }
    
    public void remover(){
        this.lista.remover(this.get());
    }
    
    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
    public int getTamanho(){
        return this.lista.getTamanho();
    }
    
}

