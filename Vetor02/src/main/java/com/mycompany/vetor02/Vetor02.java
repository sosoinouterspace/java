
package com.mycompany.vetor02;
import java.util.Scanner;

public class Vetor02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int n = 8;
        int vetorA[] = new int [n];
        int vetorB[] = new int [n];
        int i;
        
        for (i=0; i<n; i++){
            System.out.printf("Informe o %d° valor de %d posições do vetor A: ", i+1, n);
                vetorA[i] = entrada.nextInt();
        }
            
        for (i=0; i<n; i++){
           vetorB[i] = vetorA[i]*2;
        }
            
        System.out.println("Elementos do Vetor A multiplicados por 2:");
            for (i=0; i<n; i++){
            System.out.printf("[%d]",vetorB[i]);
            }
                   
    }
}
