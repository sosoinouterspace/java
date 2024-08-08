public class Strings {
    public static void main(String[] args) {
        String nome;
        nome= "Maria";

        System.out.printf("Tamanho da string nome =  %d%n", nome.length());
        System.out.printf("Terceiro caractere da string nome -= %s%n", nome.charAt(2));
        System.out.printf("Nome em maiúsculo =  %s%n", nome.toUpperCase());
        System.out.printf("Nome em minúsculo =  %s%n", nome.toLowerCase());
        System.out.printf("Maria é igual a String nome? %b%n", nome.equalsIgnoreCase("MARIA"));
        //comparando strings 
        //para comparar strings usamos o método equals
    }
}
