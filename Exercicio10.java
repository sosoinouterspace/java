class Exercicio10{
	public static void main(String[] args){
	double largura = Double.parseDouble(args[0]);
	double comprimento = Double.parseDouble(args[1]);
	double areaDoLote = largura * comprimento;

		System.out.printf("Largura: %.2f%nAltura: %.2f", largura, comprimento);
		System.out.printf("%nÁrea total do lote: %.2f", areaDoLote);


	}
}