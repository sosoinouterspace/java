/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaLigada;
import java.util.Scanner;

public class Programa {
    public static void main (String args []){
        Scanner input = new Scanner (System.in).

            System.out.println("Você gostaria de inserir um elemento em uma pilha ou em uma pilha?");
           System.out.println("1: Pilha");
        System.out.println("2: Fila");
        
        int escolha = scanner.nextInt();
        scanner.nextLine();  

        if (escolha == 1) {
          
            Pilha pilha = new Pilha();
            
            pilha.adicionar("Borracha");
            pilha.adicionar("lapis");
            pilha.adicionar("Apontador");
            pilha.adicionar("Papel");
            
            System.out.println("Tamanho da pilha: " + pilha.getTamanho());
            System.out.println("  ");
            System.out.println("Topo(inicio) da pilha: " + pilha.get());
            System.out.println("  ");
            
            pilha.remover();
            
            System.out.println("Tamanho da pilha após remoção: " + pilha.getTamanho());
            System.out.println("  ");
            System.out.println("Topo(inicio) da pilha após remoção: " + pilha.get());
            System.out.println("  ");
        } else if (escolha == 2) {
         
            Fila fila = new Fila();
            
            fila.adicionar("IFPA");
            fila.adicionar("layne");
            fila.adicionar("BELEM");
            fila.adicionar("souza");
            
            System.out.println("Tamanho da fila: " + fila.getTamanho());
            System.out.println("  ");
            System.out.println("Primeiro da fila: " + fila.get());
            System.out.println("  ");
            
            fila.remover();
            
            System.out.println("Tamanho da fila após remoção: " + fila.getTamanho());
            System.out.println("  ");
            System.out.println("Primeiro da fila após remoção: " + fila.get());
            System.out.println("  ");
        } else {
            System.out.println("Opção inválida.");
        }

      
    }
}


















            
          }
    

