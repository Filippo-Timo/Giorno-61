package Exceptions;

public class PosizioneSbagliata extends RuntimeException {
    public PosizioneSbagliata() {
        super("Il numero della posizione non è valido");
    }
}
