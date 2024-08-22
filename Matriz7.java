import java.util.Scanner;

class Matriz7{
	public static void main(String[]args){
	Scanner input = new Scanner (System.in);
	int i,j;
	double matriz[][]=new double[2][2];
	double diagonalP[]=new double [2];
	double diagonalS[]=new double [2];
	
	for (i=0;i<2;i++){
		for (j=0;j<2;j++){
			System.out.printf("Informe o valor da posição [%d][%d] na matriz: ", i, j);
			matriz[i][j]= input.nextDouble();
			
			if (i==j){
			diagonalP[i]=matriz[i][j];
			} else{
			diagonalS[i]=matriz[i][j];
				}
			}
		}
		System.out.println("Exibição da diagonal principal: ");
		for (i=0;i<2;i++){
		System.out.printf(" [%.2f]", diagonalP[i]);
		}
		System.out.println();
		System.out.println("Exibição da diagonal secundária: ");
		for (i=0;i<2;i++){
		System.out.printf(" [%.2f]", diagonalS[i]);
		}
	}
}