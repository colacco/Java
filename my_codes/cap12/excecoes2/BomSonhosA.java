import static java.lang.System.out;

class BomSonhosA {
    public static void main(String args[]){
        out.println("Com licença vou tirar uma soneca por cinco segundos...");
        try {
            tirarUmaSoneca();
        } catch (InterruptedException e){
            out.println("Ah, que revigorante.");
        }
    }

    static void tirarUmaSoneca() throws InterruptedException{
        Thread.sleep(5000);
    }
}