import static java.lang.System.out;

public class UsarTemperatura {
    public static void main(String args[]){
        final String format = "%5.2f graus %s\n";

        Temperatura temp = new Temperatura();
        temp.setNumero(70.0);
        temp.setEscala(EscalaTemp.FAHRENHEIT);
        out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(32.0);
        out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(EscalaTemp.CELSIUS);
        out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(2.73, EscalaTemp.KELVIN);
        out.printf(format, temp.getNumero(), temp.getEscala());
    }
}
