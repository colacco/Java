import static java.lang.System.out;

class MostrarHospedes{
    public static void main(String args[]){
        /*
            int hospedes[] = new int[10];
            Scanner diskScanner = new Scanner(new File("ListaHospedes.txt"));
        
            for(int i = 0; numQuarto < 10; numQuarto++){
                hospedes[i] = diskScanner.nextInt();
            }
        */

        int hospedes[] = {1, 4, 2, 1, 4, 3, 0, 2}; 
        int numQuarto = 0;

        out.println("Quarto \tHóspedes");
        for(int numHospedes : hospedes){ // Define uma variável : Escala-de-valores
            out.print(numQuarto++);
            out.print("\t");
            out.println(numHospedes);
        }
    }
} 