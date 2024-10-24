
import javax.swing.JOptionPane;

public class TesteMetodos2{
	public static void main (String [] args){

	//String s = (JOptionPane.showInputDialog("Informe a String")).toLowerCase();
	//TesteMetodos.verificarVogais(s);

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' para realizar uma soma com 2 inteiros \nDigite '3' para realizar uma soma com 3 inteiros"));

		if (x == 1){
				int v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				int v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				inteiro(v1,v2);
		} else {
			    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				inteiro(n1,n2,n3);
		}
	
		//inteiro(n1,n2,n3);
	}

	//Utilizando o conceito de sobrecarga de métodos, crie dois metodos que recebam dois e tres parametros inteiros respectivamente,
	// ao final mostre a soma desses parametos

	public static void inteiro(int v1, int v2){
		System.out.println("Soma dos valores: " + (v1 + v2));
	}
	public static void inteiro(int n1, int n2, int n3){
		System.out.println("Soma dos números: " + (n1 + n2 + n3));
		
	}
}