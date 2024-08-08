package Matriz1;

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i,j;
    int matrizA[][] = new int [3][3];
    int matrizB[][] = new int [3][3];
    int matrizC[][] = new int [3][3];
    
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            System.out.printf("informe o valor da matriz A: ");
            matrizA[i][j] = ler.nextInt();
            matrizB[i][j] = (int) Math.pow(matrizA[i][j], 2);    
        }
    }
    
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            System.out.printf("informe o valor da matriz B: ");
            matrizB[i][j] = ler.nextInt();
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            
            System.out.println("os elementos da matriz A sao:");
            for (i=0;i<3;i++){
        for (j=0;j<3;j++){
        }
            
        }
        }
}    

