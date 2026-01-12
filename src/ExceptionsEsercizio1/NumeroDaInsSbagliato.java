package ExceptionsEsercizio1;

public class NumeroDaInsSbagliato extends Exception {
    public NumeroDaInsSbagliato() {
        super("Il numero da inserire non è valido");
    }
}
