/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaLigada;

/**
 *
 * @author ALSOLIMA
 */
public class Programa {
    public static void main (String args []){
        ListaLigada lista = new ListaLigada();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
          
        System.out.println ("Tamanho: " + lista.getTamanho());
        System.out.println ("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println ("Ultimo: " + lista.getUltimo().getValor());
        System.out.println (lista.get(0).getValor());
        System.out.println (lista.get(1).getValor());
        System.out.println (lista.get(2).getValor());
        System.out.println (lista.get(3).getValor());
    
        
          for (int i = 0; i < lista.getTamanho();i++){
                System.out.println (lista.get(i).getValor());
          }
          lista.remover("CE");
          System.out.println("Removeu estado CE");
          
          
          for (int i = 0; i < lista.getTamanho();i++){
                System.out.println (lista.get(i).getValor());
          }
          }
    }

