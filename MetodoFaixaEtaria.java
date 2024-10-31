public class MetodoFaixaEtaria{

	public static String faixaEtaria(int idade){
		String faixaEtaria = "";
		if (idade >= 0 && idade <= 2) faixaEtaria = "Bebê";
		else if (idade >= 3 && idade <= 11) faixaEtaria = "Criança";
		else if (idade >= 12 && idade <= 19) faixaEtaria = "Adolescente";
		else if (idade >= 20 && idade <= 30) faixaEtaria = "Jovem";
		else if (idade >= 31 && idade <= 60) faixaEtaria = "Adulto";
		else if (idade > 60) faixaEtaria = "Idoso";
		else faixaEtaria = "Valor inválido";
		return faixaEtaria;
	}
}

	
