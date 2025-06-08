public class charstring {
    public static void main(String[] args){
        char carac1 = 'O';
        char carac2 = 'l';
        char carac3 = 'a';

        String frase = String.format("%c%c%c mundo!", carac1, carac2, carac3);
        System.out.println(frase);
    }    
}
