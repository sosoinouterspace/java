import java.util.Scanner;
import javax.swing.JOptionPane;

public class TesteMetodos{
	public static void main (String[] args){

		//imprimir();
		//imprimir ("Segundo método");
		//valor();
		

	}
							// assinatura do método = "imprimir()" - nome + lista de parametros
	public static void imprimir(){
		System.out.println("Método imprimir");

	}
							//   sobrecarga de métodos --> métodos que possuem o mesmo nome mas com assinaturas diferentes (lista de parametros diferentes) 
	public static void imprimir(String x){
		System.out.println("Método imprimir " + x);
	}

	/*public static void imprimir(String x, String z){
		System.out.println("Método imprimir " + x + y);
	}
	public static void imprimir(String y){
		System.out.println("Método imprimir " + y);
	}*/

// Crie um método sem retorno que solicite 5 valores inteiros, ao final mostre quantos sao maiores que 5
	public static void valor(){
	Scanner entrada = new Scanner (System.in);
	 int x;
	 int maior = 0;

	 for (x=0; x<5;x++){
	 	System.out.print("Informe um valor: ");
	    int v = entrada.nextInt();

	 	if (v > 5){
	 		maior++;
	 	}	
	 }
	 System.out.print("Quantidade de números maiores que 5: " + maior);
   }

   //Crie um método sem retorno que receba uma String como parametro e ao final mostre quantas vogais existem nela

   public static void verificarVogais(String s){
   	int contarVogais = 0;
   	

   	for (int i=0;i<s.length();i++){
   		if (s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
   			contarVogais+=1;
   		}
   	}
   	System.out.printf("%d vogais encontradas(s)", contarVogais);

   }
	
}

