public class Temperatura {
    private double numero;
    private EscalaTemp escala;
    
    public Temperatura() {
        numero = 0.0;
        escala = EscalaTemp.FAHRENHEIT;
    }

    public Temperatura(double numero){
        this.numero = numero;
        escala = EscalaTemp.FAHRENHEIT;
    }

    public Temperatura(EscalaTemp escala){
        numero = 0.0;
        this.escala = escala;
    }

    public Temperatura(double numero, EscalaTemp escala){
        this.numero = numero;
        this.escala = escala;
    }

    public void setNumero(double numero){
        this.numero = numero;
    }

    public double getNumero(){
        return numero;
    }

    public void setEscala(EscalaTemp escala){
        this.escala = escala;
    }

    public EscalaTemp getEscala(){
        return escala;
    }
}
