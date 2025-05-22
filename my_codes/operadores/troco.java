import static java.lang.System.out;

class troco {
    public static void main(String args[]){
        int total = 248;
        int quartos = total / 25;
        int oqueSobra = total % 25;

        int dezcentavos = oqueSobra / 10;
        oqueSobra %= 10;

        int cincocentavos = oqueSobra / 5;
        oqueSobra %= 5;

        int centavos = oqueSobra;

        out.println("De " + total + " centavos obtidos, se obtém:");
        out.println(quartos + " quartos");
        out.println(dezcentavos + " moedas de dez centavos");
        out.println(cincocentavos + " moedas de cinco centavos");
        out.println(centavos + " centavos extra");
    }
}
