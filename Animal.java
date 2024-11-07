public class Animal{
	private String especie;
	private int qtdPatas;
	public String nome;

	public void exibirInformacoes(){
		System.out.println("Especie: " + especie + "\nQuantidade de patas: " + qtdPatas + "\nNome: " + nome);
	} 

	public void exibirNome(){
		System.out.println("Nome: " + nome);
	}

	public int exibirQtdPatas(){
		return qtdPatas;
	
	}
	public void definirEspecie(String especie){
		this.especie = especie;
	}
}