class Exercicio11{
	public static void main(String[] args){
	double valor1 = Double.parseDouble(args[0]);
	double valor2 = Double.parseDouble(args[1]);
	double valor3 = Double.parseDouble(args[2]);
	double valor4 = Double.parseDouble(args[3]);
	double media = (valor1+valor2+valor3+valor4)/4;
	double soma = valor1 + valor2 + valor3 + valor4;

	System.out.printf("A soma desses valores: %.2f %nA média desses valores: %.2f", soma, media);

	}
}