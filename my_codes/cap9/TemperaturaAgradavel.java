import static java.lang.System.out;

public class TemperaturaAgradavel extends Temperatura {
    public TemperaturaAgradavel(){
        super();
    }

    public TemperaturaAgradavel(double numero){
        super(numero);
    }

    public TemperaturaAgradavel(EscalaTemp escala){
        super(escala);
    }

    public TemperaturaAgradavel(double numero, EscalaTemp escala){
        super(numero, escala);
    }

    public void display(){
        out.printf("%5.2f graus %s\n", getNumero(), getEscala());
    }
}
