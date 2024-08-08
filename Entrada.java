// Desenvolvido por Sofia Sacramenta
/* Criado em 08/08/2024
 * Funcção: utilizar a classe JOptionPane
 */

 import javax.swing.JOptionPane;
 class Entrada{
    public static void main(String[] args){
        // mensagem de alerta
        JOptionPane.showMessageDialog(null, "eu finjo que nao percebo");
        //entrada de dados
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
    }
 }
 