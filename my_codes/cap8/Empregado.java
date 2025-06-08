import static java.lang.System.out;

public class Empregado {
    private String nome;
    private String cargo;
    
    public void setNome(String nomeIn){
        nome = nomeIn;
    }

    public String getNome(){
        return nome;
    }

    public void setCargo(String cargoIn){
        cargo = cargoIn;
    }

    public String getCargo(){
        return cargo;
    }

    public void preencherCheque(double valorPago){
        out.printf("Pague em nome de %s ", nome);
        out.printf("(%s) ***$", cargo);
        out.printf("%,.2f\n", valorPago);
    }
}
