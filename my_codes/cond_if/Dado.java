import java.util.Random;

public class Dado {
    public static void main(String[] args){
        int jogueODado = new Random().nextInt(6) + 1;
        System.out.println(jogueODado);
    }
}
