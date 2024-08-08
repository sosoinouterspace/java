import java.util.Scanner;
//java.lang.* é um pacote importado automaticamente em todos os programas

public class EntradaDeDados {
    public static void main(String[] args){
        //Criando o objeto
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.next();

        System.out.printf("Nome digitado: %s", nome);

    }
    
}
