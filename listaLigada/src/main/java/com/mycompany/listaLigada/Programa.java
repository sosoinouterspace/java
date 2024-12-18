/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaLigada;
import java.util.Scanner;

public class Programa {
    public static void main (String args []){
        Scanner input = new Scanner (System.in).

            System.out.println("Escolha estrutura de pilha ou fila");
            System.out.println("1: Pilha");
            System.out.println("2: Fila");
        
           int entrada = input.nextInt();

            switch (entrada){
                    case 1:
                    Pilha pilha = new Pilha();
            
                    pilha.adicionar("Livro de Fantasia");
                    pilha.adicionar("Livro de Terror");
                    pilha.adicionar("Livro didático");
                    pilha.adicionar("Caderno Planner");
            
                    System.out.println("Tamanho da pilha: " + pilha.getTamanho());
                    System.out.println("Topo da pilha: " + pilha.get());
            
                    pilha.remover();
            
                    System.out.println("Tamanho da pilha após remoção: " + pilha.getTamanho());
                    System.out.println("Topo da pilha após remoção: " + pilha.get());

                    break;
                    case 2:
                    Fila fila = new Fila();
            
                    fila.adicionar("Camisa");
                    fila.adicionar("Blusa com estampa");
                    fila.adicionar("Calça");
                    fila.adicionar("Vestido");
            
                    System.out.println("Tamanho da fila: " + fila.getTamanho());
                    System.out.println("Primeiro da fila: " + fila.get());
            
                    fila.remover();
                
                    System.out.println("Tamanho da fila após remoção: " + fila.getTamanho());
                    System.out.println("Primeiro da fila após remoção: " + fila.get());
                    default:
                    System.out.println("Valor inválido");
        }
      
    }
}


















            
          }
    

