import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		int[][] matriz = {{1,2,3}, {1,2,3}, {1,2,3}};
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> frequencia = new ArrayList<Integer>();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(!lista.contains(matriz[i][j])) lista.add(matriz[i][j]);
			}
		}
		
		System.out.println(lista.toString());
		
		for(int n : lista) {
			int contagem=0;
			for(int[] l : matriz) {
				for(int x : l) {
					if(x==n) contagem++;
				}
			}
			frequencia.add(contagem);
		}
	}
}