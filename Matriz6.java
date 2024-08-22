import java.util.Scanner;

class Matriz6{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int i,j;
		double matrizA [][] = new double [2][2];
		double matrizB [][] = new double [2][2];
		double vetorC [] = new double [2];
		double vetorD [] = new double [2];
		
		for (i=0;i<2;i++){
			for (j=0;j<2;j++){
			System.out.printf("Insira o número da posição [%d][%d] da matriz A: ", i , j );
				matrizA[i][j]=input.nextDouble();
			}
		}
		for (i=0;i<2;i++){
			for (j=0;j<2;j++){
			System.out.printf("Insira o número da posição [%d][%d] da matriz B: ", i , j );
				matrizB[i][j]=input.nextDouble();
			    
			}
		}
		System.out.println("Valor do Vetor C:");
			for (i=0;i<2;i++){
			vetorC[i]= matrizA[0][i]+matrizB[0][i];
			System.out.println(""+vetorC[i]);
		
		}
		System.out.println("Valor do Vetor D:");
		for (i=0;i<2;i++){
			vetorD[i]=matrizA[1][i]+matrizB[1][i];
			System.out.println( "" + vetorD[i]);
		}
	}	
			
}			
		
		