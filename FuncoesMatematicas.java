public class FuncoesMatematicas{
	public static void main(String[]args){
	final double SALARIO = 500;
	double a = 4.8;
	double b = 5.3;
	double c = Math.round(a);
	double d = Math.round(b);
	System.out.println("Constante de Euler: " + Math.E);	
	System.out.println("Salario de professor: " + SALARIO);	
	System.out.println("Constante PI: " + Math.PI);	
	System.out.println("Valor de a arrendodado: " + c);
	System.out.println("Valor de b arrendodado: " + d);
	System.out.println("Arredondando para o próximo inteiro: " + Math.ceil(a));
	System.out.println("Arredondando para o inteiro anterior: " + Math.floor(a));
	System.out.println("Valor máximo: " + Math.max(3,8));	
	System.out.println("Valor mínimo: " + Math.min(a,Math.min(c,d)));
	System.out.println("Número ao quadrado: " + Math.pow(3,2));
	System.out.println("Raiz quadrada: " + Math.sqrt(0));
	System.out.println("Raiz cúbica: " + Math.cbrt(340));


	}
}