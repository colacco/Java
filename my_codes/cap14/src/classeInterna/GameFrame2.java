package classeInterna;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameFrame2 extends JFrame{
    private static final long serialVersionUID = 1L;

    int numeroAleatorio = new Random().nextInt(10) + 1;
    int numPalpites = 0;

    JTextField textField = new JTextField(5);
    JButton button = new JButton("Adivinhe");
    JLabel label = new JLabel(numPalpites + "palpites");

    public GameFrame2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(label);
        button.addActionListener(new MyActionListener()); // "Ouve" quando o botão é clicado.
        pack();
        setVisible(true);
    }

    class MyActionListener implements ActionListener{ // Classe interna de GameFrame2. É possível também fazer referência à membros (campos e métodos) externos.
        @Override
        public void actionPerformed(ActionEvent e) {
            String textFieldText = textField.getText();

            if (Integer.parseInt(textFieldText) == numeroAleatorio) {
                button.setEnabled(false);
                textField.setText(textFieldText + "Sim!");
                textField.setEnabled(false);
            } else {
                textField.setText("");
                textField.requestFocus(); // Após errar, retorne ao campo de texto para o usuário digitar novamente.
            }

            numPalpites++;
            String palavraPalpite = (numPalpites == 1) ? "palpite" : "palpites";
            label.setText(numPalpites + palavraPalpite);
        }
    }
}
