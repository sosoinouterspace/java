
package ifpa.matriz3;
import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int i,j;
    int matrizA[][] = new int [3][3];
    int matrizB[][] = new int [3][3];
    int matrizC[][] = new int [3][3];
    
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            System.out.printf("Informe o valor [%d][%d] da matriz A : ", i+1,j+1);
            matrizA[i][j] = entrada.nextInt();
             
        }
    }
    
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            System.out.printf("Informe o valor [%d][%d] da matriz B: ", i+1,j+1);
            matrizB[i][j] = entrada.nextInt();
            matrizC[i][j] = matrizA[i][j]+matrizB[i][j];
        }
    }
        System.out.println("Os elementos da matriz A são:");
            for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            System.out.printf(" [%d]", matrizA[i][j]);
        }
            System.out.println();
        }
         System.out.println("Os elementos da matriz B são:");
            for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            System.out.printf(" [%d]", matrizB[i][j]);
        }
           System.out.println(); 
        } 
            System.out.println("A soma dos elementos das duas matrizes:");
            for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            System.out.printf(" [%d]", matrizC[i][j]);
        }
                System.out.println();
        }
    }
}
