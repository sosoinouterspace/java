
package com.mycompany.vetor3;
import java.util.Scanner;

public class Vetor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int vetorA[] = new int [15];
        int vetorB[] = new int [15];
        int i;
        
        for (i=0; i< vetorA.length; i++){
            System.out.printf("Informe o %d° valor de %d posições do vetor A: ", i+1,vetorA.length);
                vetorA[i] = entrada.nextInt();
        }
            
        for (i=0; i<vetorB.length; i++){
           vetorB[i] = vetorA[i]*vetorA[i];
        }
            
        System.out.println("Elementos do Vetor A multiplicados por 2:");
            for (i=0; i< vetorA.length; i++){
            //System.out.printf("[%d]",vetorB[i]);
            System.out.printf("vetor A[%d] = %d,  vetor B[%d] = %d\n", i+1, vetorA[i], i+1, vetorB[i]);
            }
                   
    }
}