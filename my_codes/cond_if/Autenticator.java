import javax.swing.JOptionPane;

public class Autenticator {
    public static void main(String[] args){
        String username = JOptionPane.showInputDialog("Nome do " + "usuário: ");
        String password = JOptionPane.showInputDialog("senha: ");

        if (username != null && password != null  && (username.equals("bburd") && password.equals("swordfish") || username.equals("hritter") && password.equals("preakston"))){
            JOptionPane.showMessageDialog(null, "Voccê está conectado.");
        } else {
            JOptionPane.showMessageDialog(null, "Você é suspeito");
        }
    }
}
