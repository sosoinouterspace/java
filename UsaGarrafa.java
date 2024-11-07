public class UsaGarrafa{
	public static void main(String [] args){
		Garrafa garrafa1 = new Garrafa();
		garrafa1.encher();
		garrafa1.esvaziar();
		garrafa1.tipoMaterial = "Plástico";
		garrafa1.capacidade = 500;
		
		System.out.println(garrafa1.tipoMaterial);
		System.out.println(garrafa1.capacidade);
		

		// Criar uma nova instancia a partir de gararafa
		// Executar seus metodos e preencha seus atributos
		System.out.println("--------------------------------------------");
		Garrafa garrafa2 = new Garrafa();
		garrafa2.tipoMaterial = "Vidro";
		garrafa2.capacidade = 1000;

		garrafa2.mostrarConteudo();
		garrafa2.encher();
		garrafa2.esvaziar();
	}
}