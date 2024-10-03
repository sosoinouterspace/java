import java.util.Scanner;

public class VerificacaoCongelamento{
	public static void main(String[]args){
	Scanner entrada = new Scanner(System.in);
	double tCelsius;

	System.out.print("Insira o valor da temperatura em graus Celsius: ");
	tCelsius = entrada.nextDouble();

	String verificacao = (tCelsius < 0)?"A temperatura está abaixo do ponto de congelamernto":"A temperatura não está abaixo do ponto de congelamento";

	System.out.printf("Verificação do ponto de congelamento: %s ", verificacao);
	}
}