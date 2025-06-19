import static java.lang.System.out;

public class FalanteDePortugues2 {
    String marte;

    void visiteSantaCatarina() {
        out.println("VisiteSC está em execução:");

        marte = " planeta vermelho";
        String riqueza = " População: 25";

        out.println(marte);
        out.println(riqueza);
    }

    void visiteSaoPaulo() {
        out.println("VisiteSP está em execução:");
        out.println(marte);
        //out.println(riqueza); 
        // cannot resolve symbol -- Não vai funcionar por não estar declarada fora do método
    }
}
