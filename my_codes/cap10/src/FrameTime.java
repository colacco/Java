import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class FrameTime extends JFrame {
    public FrameTime() throws IOException{
        JogadorPlus jogador;
        Scanner keyboard = new Scanner(new File("Hankees.txt"));

        for (int num = 1; num <= 9; num++){
            jogador = new JogadorPlus(keyboard.nextLine(), keyboard.nextDouble());
            keyboard.nextLine();
            addJogadorInfo(jogador);
        }

        add(new JLabel());
        add(new JLabel(" ------"));
        add(new JLabel("Média de Rebatimento do Time:"));
        add(new JLabel(JogadorPlus.calcMediaTimeString()));

        setTitle("Os Hankees");
        setLayout(new GridLayout(11, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    void addJogadorInfo(JogadorPlus jogador){
        add(new JLabel(" " + jogador.getNome()));
        add(new JLabel(jogador.getMediaString()));
    }
}
