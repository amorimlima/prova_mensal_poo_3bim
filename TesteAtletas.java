/*
 * Nome: Giulia Amorim Lima
 * Data: 29/08/2023
 */

public class TesteAtletas {
    public static void main(String args[]){
        System.out.println("\n\n");

        Maratonista mineiro = new Maratonista();
        mineiro.setNome("Jose dos Santos");
        mineiro.correr();

        System.out.println("\n\n");  

        Estradista corisco = new Estradista();
        corisco.setNome("Manoela Assis");
        corisco.pedalar();

        System.out.println("\n\n");
      }
    
}
