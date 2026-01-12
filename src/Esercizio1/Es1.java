package Esercizio1;

import ExceptionsEsercizio1.NumeroDaInsSbagliato;
import ExceptionsEsercizio1.PosizioneSbagliata;
import ExceptionsEsercizio1.PosizioneZero;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) throws NumeroDaInsSbagliato, PosizioneZero {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            int randomNumber = random.nextInt(10) + 1;
            numeri[i] = randomNumber;
        }
        System.out.println(Arrays.toString(numeri));

        int n;
        int posizione;

        do {
            System.out.println("Inserisci un numero da 1 a 5 per la posizione in cui andrà inserito il numero");
            posizione = input.nextInt();
            if (posizione != 0) {
                if (posizione > 0 && posizione <= numeri.length) {
                    System.out.println("Inserisci un numero da 1 a 10 da inserire nell'array");
                    n = input.nextInt();
                    if (n >= 0 && n <= 10) {
                        numeri[posizione - 1] = n;
                        System.out.println(Arrays.toString(numeri));
                    } else {
                        throw new NumeroDaInsSbagliato();
                    }
                } else {
                    throw new PosizioneSbagliata();
                }
            } else {
                throw new PosizioneZero();
            }
        }
        while (posizione != 0);
    }
}
