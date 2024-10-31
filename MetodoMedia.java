/* Crie uma classe que contenha três métodos com retorno com o nome “média”
utilizando o conceito de sobrecarga. Os métodos devem calcular a média de dois, três ou quatro valores
de entrada. Desta Forma, a assinatura dos métodos deve ser: media(double a, double b);
media(double a, double b, double c) e média( double a, double b, double c, double d).
Em seguida, crie outra classe que invoca o referido método

Duas classes como resposta */

public class MetodoMedia{
	public static double media (double a, double b){
		double calcMedia = a+b/2;
		return calcMedia;

	}
	public static double media (double a, double b, double c){
		double calcMedia = a+b+c/3;
		return calcMedia;
		
	}
	public static double media (double a, double b, double c, double d){
		double calcMedia = a+b+c+d/4;
		return calcMedia;
		
	}

}