package Esercizio2;

import java.util.Scanner;

public class Es2bis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di Km percorsi");
            double km = input.nextDouble();
            System.out.println("Inserisci il numero di Litri di carburante consumati");
            double litri = input.nextDouble();
            if (litri == 0 || litri == 0.0) {
                System.out.println("Impossibile inserire 0 come valore di litri di carburante consumato");
            } else {
                double consumo = km / litri;
                System.out.println("Hai percorso " + consumo + " km per litro");
            }
        } catch (Exception e) {
            System.out.println("Il valore non è valido");
        }
    }
}
