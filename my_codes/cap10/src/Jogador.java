import java.text.DecimalFormat;

public class Jogador{
    private String nome;
    private double media;

    public Jogador(String nome, double media){
        this.nome = nome;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia(){
        return media;
    }

    public String getMediaString(){
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMaximumFractionDigits(3);
        return decFormat.format(media);
    }
}