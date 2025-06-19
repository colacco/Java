/*
    Crie uma classe Animal com um metodo emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal.
    Adicione o metodo emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o metodo.
    Além disso, adicione metodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
*/

package ex2;

public class Main {
    public static void main(String args[]){
        Animal coruja = new Animal();
        Cachorro rex = new Cachorro();
        Gato schrodinger = new Gato();

        coruja.emitirSom();
        rex.emitirSom();
        rex.abanarRabo();
        schrodinger.emitirSom();
        schrodinger.arranharMoveis();
    }
}
