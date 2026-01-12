package Esercizio3;

import ExceptionsEsercizio3.BancaException;

public class Es3 {
    public static void main(String[] args) throws BancaException {
        ContoCorrente contoCorrente = new ContoCorrente("Filippo", 10);
        ContoOnLine contoOnLine = new ContoOnLine("Filippo", 20, 5);

        contoCorrente.preleva(5.6);
        System.out.println("Saldo ancora disponibile: " + contoCorrente.getSaldo());
        contoCorrente.preleva(5.6);
        System.out.println("Saldo ancora disponibile: " + contoCorrente.getSaldo());

//        contoOnLine.preleva(5);
//        System.out.println("Saldo ancora disponibile: " + contoOnLine.getSaldo());


    }
}
