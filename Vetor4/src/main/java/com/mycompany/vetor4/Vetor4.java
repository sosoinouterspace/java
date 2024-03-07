
package com.mycompany.vetor4;
import java.util.Scanner;
import java.lang.Math;



public class Vetor4 {
    
    public static void main(String[] args){
 Scanner entrada = new Scanner (System.in);
        
        float vetorA[] = new float [15];
        float vetorB[] = new float [15];
        int i;
        
        for (i=0; i< vetorA.length; i++){
            System.out.printf("Informe o %d° valor de %d posições do vetor A: ", i+1,vetorA.length);
                vetorA[i] = entrada.nextInt();
        }
            
        for (i=0; i<vetorB.length; i++){
           vetorB[i] = (float) Math.sqrt(vetorA[i]);   
        }
            
        System.out.println("Elementos do Vetor A multiplicados por 2:");
            for (i=0; i< vetorA.length; i++){
            //System.out.printf("[%d]",vetorB[i]);
            System.out.printf("vetor A[%d] = %.2f,  vetor B[%d] = %.2f\n", i+1, vetorA[i], i+1, vetorB[i]);
            }
       }        
 }