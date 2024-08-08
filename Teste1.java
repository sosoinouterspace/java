import javax.swing.JOptionPane;

public class Teste1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));

        JOptionPane.showMessageDialog(null, "Nome em maiúsculo: " +  nome.toUpperCase());
        JOptionPane.showMessageDialog(null, "Nome em minúsculo: " + nome.toLowerCase());
        JOptionPane.showMessageDialog(null, "Nome em aspas simples: " + "\'" + nome + "\'" );
        JOptionPane.showMessageDialog(null, "Nome em contrabarras: " + "\\" + nome + "\\");
        JOptionPane.showMessageDialog(null, "Sua idade multiplicada por 3: " + (idade*3));
        JOptionPane.showMessageDialog(null, "Sua idade menos 2: " + + (idade-2));
    }
}
