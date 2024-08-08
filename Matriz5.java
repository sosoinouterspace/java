
package ifpa.matriz5;

import java.util.Scanner;
public class Matriz5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int i,j;
        int matriz[][] = new int [2][2];
        int par = 0;
        int impar = 0;
        
    for (i=0;i<2;i++){
        for(j=0;j<2;j++){
            System.out.printf("Informe o valor [%d][%d] da matriz: ", i+1,j+1);
            matriz[i][j] = entrada.nextInt();
        }
    }    
     for (i=0;i<2;i++){
        for(j=0;j<2;j++){
           if (matriz[i][j]%2 == 0){
               par++;
           } else {
               impar++;  
           }
        }
    }     
        System.out.println("Matriz:");
            for (i=0;i<2;i++){
        for (j=0;j<2;j++){
            System.out.printf(" [%d]", matriz[i][j]);
        }
                System.out.println();
        }     
        System.out.println("Quantidade de pares:" + par);
        System.out.println("Quantidade de ímpares:" + impar);
    }
}
