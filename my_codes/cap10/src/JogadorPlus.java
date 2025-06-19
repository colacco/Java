import java.text.DecimalFormat;

public class JogadorPlus extends Jogador{
    
    private static int jogaodrCont  = 0;
    private static double totalDeMedias = .000;
    private static DecimalFormat decFormat = new DecimalFormat();

    static {
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMaximumFractionDigits(3);
    }

    public JogadorPlus(String nome, double media){
        super(nome, media);
        jogaodrCont++;
        totalDeMedias += media;
    }

    public static double calcMediaTime(){
        return totalDeMedias/jogaodrCont;
    }

    public static String calcMediaTimeString(){
        return decFormat.format(totalDeMedias/jogaodrCont);
    }
}
