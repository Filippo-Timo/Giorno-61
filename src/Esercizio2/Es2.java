package Esercizio2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di Km percorsi");
            int km = input.nextInt();
            System.out.println("Inserisci il numero di Litri di carburante consumati");
            int litri = input.nextInt();
            int consumo = km / litri;
            System.out.println("Hai percorso " + consumo + " km per litro");
        } catch (Exception e) {
            System.out.println("Il valore non è valido oppure hai insrito 0 come numero di litri consumati");
        }
    }
}
