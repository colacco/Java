package exercicios.ex6;
// Faça uma classe que devolva o tipo da variável

public class InputAllBaseTypes {
    String tipo;

    public InputAllBaseTypes(){
        tipo = "null";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(byte i){
        tipo = "byte";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(short i){
        tipo = "short";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(int i){
        tipo = "int";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(long i){
        tipo = "long";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(float i){
        tipo = "float";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(double i){
        tipo = "int";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(char i){
        tipo = "char";
        System.out.println("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(String i){
        tipo = "String";
        System.out.print("O tipo é: " + tipo);
    }

    public InputAllBaseTypes(boolean i){
        tipo = "boolean";
        System.out.print("O tipo é: " + tipo);
    }
}
