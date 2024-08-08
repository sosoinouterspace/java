/*
    Objetivo: Programa para aprender sobre variaveis e constantes
    Desenvolvedor: Sofia
    Data e Hora: 29 de fevereiro de 2024 10:54

*/


class VariaveisEConstantes{
    public static void main(String args[]){
    byte valor1;
    short valor2;
    long valor3;
    double valor4;
    float valor5;
    char valor6;
    boolean valor7;
    int idade = 18;
    final int constante = 10;

    valor1 = 10;
    valor2 = 30;
    valor3 = 22;
    valor4 = 12.5;
    valor5 = 13.2f;
    valor6 = 't';
    valor7 = true;

    System.out.println("Valor 1: " + valor1);
    System.out.println("Valor 2: " + valor2);
    System.out.println("Valor 3: " + valor3);
    System.out.println("Valor 4: " + valor4);
    System.out.println("Valor 5: " + valor5);
    System.out.println("Valor 6: " + valor6);
    System.out.println("Valor 7: " + valor7);
    System.out.printf("%s %.2f" , "Valor 4:", valor4);
    System.out.printf("%n%s %d","Idade:", idade);
    System.out.printf("%nA constante é %d", constante);
    }
    
}