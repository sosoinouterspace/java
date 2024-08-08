public class TaxaDeConsumo {
    public static void main(String[] args){
    double distancia_km;
    double litros;
    double taxaDeConsumo; 
    distancia_km = 100;
    litros = 10.5;
    taxaDeConsumo = distancia_km/litros;

    System.out.println("A distância em km percorrida pelo carro: " + distancia_km +" km");
    System.out.println("A quantidade de litros consumidos: " + litros);
    System.out.printf("A taxa de consumo: %.2f" , taxaDeConsumo);

    }
    
}
