public class Garrafa{
	public String tipoMaterial;
	public int capacidade;

	public void encher(){
		System.out.println("Enchendo a Garrafa");
	}

	public void esvaziar(){
		System.out.println("Esvaziando a Garrafa");
	}

	public void mostrarConteudo(){
		System.out.println("Material: " + tipoMaterial + "\nCapacidade: " + capacidade);
	}
}