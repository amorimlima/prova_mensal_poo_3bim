/*
 * Nome: Giulia Amorim Lima
 * Data: 29/08/2023
 */

public abstract class pessoa implements Ciclista {
    public String Nome;

    public pessoa(String Nome) {
        this.Nome = Nome;
    }

    public String getnome() {
        return Nome;
    }
    
}