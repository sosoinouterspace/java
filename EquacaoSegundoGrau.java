/* criado por Júlia Costa Barbosa
matricula: 20232261559
turma: I2262MF
turno manhã
/*


import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("O valor de delta é: " + delta);

        
        if (delta > 0) {
            
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
        } else if (delta == 0) {
            
            double raiz = -b / (2 * a);
            System.out.println("A equação tem uma raiz única: " + raiz);
        } else {
            
            System.out.println("A equação não possui raízes reais.");
        }

        
    }
}