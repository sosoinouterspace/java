/* 3. Crie uma classe que contenha um método sem retorno chamado “pegaMes”, que receba uma
data em formato de texto padrão “dd/mm/aaaa” e retorne exiba o número referente ao mês conforme
a imagem abaixo(use JOptionPane). */

import javax.swing.JOptionPane;
public class MetodoMes{
	public static void pegaMes(String dia, String mes, String ano){
	 		dia = "";
		    mes = "";
		    ano = "";

		System.out.printf("Data: %s / %s / %s", dia, mes, ano);
		


	}
	public static void main (String [] args){
		pegaMes("11","03","2008");
	}
}