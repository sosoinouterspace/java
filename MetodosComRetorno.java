public class MetodosComRetorno{
	
	public static int contaLetrasA(String palavra){
	int quantidade = 0;
	palavra = palavra.toUpperCase();
	for (int a=0; a<palavra.length();a++){
		if (palavra.charAt(a)== 'A')
			quantidade++;
		 }
		return quantidade;
	 }
		// metodo 2            // parametro 
	public static double somar(double a,double b){
		return a+b;
	}
		// metodo 3
	public static String pares(int valor){
		String retorno = "";   // escopo = alcance (global ou local) - define a visibiliade da variável
		for (int a=0;a<=valor;a=a+2){
			retorno+= a + " ";
		}
		return retorno;
	}
		// metodo 4
	public static String diaPorExtenso(int dia){
	   String extenso = "";
		if (dia == 1) extenso = "Domingo";
		else if (dia == 2) extenso = "Segunda";
		else if (dia == 3) extenso = "Terça";
		else if (dia == 4) extenso = "Quarta";
		else if (dia == 5) extenso = "Quinta";
		else if (dia == 6) extenso = "Sexta";
		else if (dia == 7) extenso = "Sábado";
		else extenso = "dia não reconhecido";
		return extenso;
	}
		// metodo 5
	public static void main (String [] args){       // argumento
		System.out.println(MetodosComRetorno.somar(2,3));
		System.out.println(MetodosComRetorno.pares(100));
		System.out.println(MetodosComRetorno.diaPorExtenso(1));
		System.out.println(MetodosComRetorno.contaLetrasA("Banana"));
	   }
	}

