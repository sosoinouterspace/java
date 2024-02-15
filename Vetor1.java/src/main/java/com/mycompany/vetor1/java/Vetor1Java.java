
package com.mycompany.vetor1.java;
import java.util.Scanner;


public class Vetor1Java {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = 10; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor
        int i; // indice ou posição
        int soma = 0;
        
        // entrada de dados
        for (i=0; i<n; i++) {
            System.out.printf("Informe %2do. posição : ", (i+1));
            v[i] = ler.nextInt();
            
        }
            
        for (i=0; i<n; i++) {
            soma = soma + v[i];
        } 
        System.out.printf("A soma dos valores do vetor é : %d ", soma);
    }    
}
    
