
package com.mycompany.vetor01;
import java.util.Scanner;

public class Vetor01 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int n = 5;
        int vetorA[] = new int[n];
        int vetorB[] = new int[n];
        int i;
        
        for (i=0; i<n; i++){
            System.out.printf("Informe o %d° valor de %d posições do vetor A: ", i+1, n);
            vetorA[i] = entrada.nextInt();
        }
        for (i=0; i<n; i++){
            vetorB[i] = vetorA[i];
        }
        System.out.println("Elementos do Vetor A:");
        for (i=0; i<n; i++){
        System.out.printf("[%d]", vetorA[i]);
        }
        
        System.out.println("\nElementos do Vetor B:");
        for (i=0; i<n; i++){
        System.out.printf("[%d]", vetorB[i]);
        }
    }
}
