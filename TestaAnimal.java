public class TestaAnimal{
	public static void main(String [] args){
		Animal animal= new Animal();
		animal.nome = "Jake";
		//animal.qtdPatas = 4;
		animal.definirEspecie("Gato");

		animal.exibirInformacoes();
		animal.exibirNome();
		//System.out.println(animal.exibirQtdPatas());
		animal.exibirInformacoes();
	}
}	