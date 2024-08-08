import java.util.Scanner;;
public class prova {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
    int vA [] = new int [15];
    int vB [] = new int [15];
    int vC [] = new int [15];
    int i;

    for (i = 0; i<vA.length; i++){
        System.out.printf("Digite a posição [%d] para 15 valores para o vetor A:", i+1, vA.length);
        vA [i] = ler.nextInt();
    }
    for (i = 0; i<vB.length; i++){
        vB [i] = vA[i] * vA[i];
    }
    for (i = 0; i<vC.length; i++){
        vC[i] = vA[i] - vB[i];
    }
    for (i = 0; i<vA.length; i++){
    System.out.printf("A posição [%d] do vetor A é: %d \n", i, vA[i]);
    System.out.printf("A posição [%d] do vetor B elevado ao quadrado é %d \n", i, vB[i]);
    System.out.printf("O elemento de posição [%d] do vetor A = %d ,este valor menos o elemento de posição [%d] do vetor B é igual a %d \n", i, vA[i], i , vC[i]);
       }
    }
}

