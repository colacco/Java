import static java.lang.System.out;

public class BomSonhosB {
    public static void main(String args[]){
        out.println("Com licença vou tirar uma soneca por cinco segundos...");
        
        tirarUmaSoneca();

        out.println("Ah, que revigorante.");
    }

    static void tirarUmaSoneca(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            out.println("Ei, quem me acordou?");
        }
    }
}
