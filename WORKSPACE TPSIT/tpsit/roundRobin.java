package it.edu.iisgubbio;

public class roundRobin {

    public static void main(String[] args) {
        // Dichiarazione e inizializzazione delle variabili
        String[] processo = new String[4];
        int[] tArrivo = new int[4];
        int[] tEse = new int[4];
        int[] tServizio = new int[4];
        double[] tAttesa = new double[4];
        double media = 0;
        int quantitaTempo = 3;
        int tExeRim = 0;

        // Inizializzazione dei processi
        processo[0] = "P0";
        processo[1] = "P1";
        processo[2] = "P2";
        processo[3] = "P3";

        // Inizializzazione dei tempi di arrivo
        tArrivo[0] = 0;
        tArrivo[1] = 1;
        tArrivo[2] = 2;
        tArrivo[3] = 3;

        // Inizializzazione dei tempi di esecuzione
        tEse[0] = 5;
        tEse[1] = 3;
        tEse[2] = 8;
        tEse[3] = 6;

        System.out.println("Quanto di tempo: " + quantitaTempo);

        for (int i = 0; i < 4; i++) {
            if (tArrivo[i] == 0) {
                tServizio[0] = 0;
                tAttesa[0] = 0;
            } else {
                tServizio[i] = tServizio[i - 1] + tEse[i - 1];
                tAttesa[i] = tServizio[i] - tArrivo[i];
                media = media + tAttesa[i];
                tEseRim = tEse[i] - 3;
                tEse[i] = tEseRim;
            }

            // Stampa dei dettagli del processo
            System.out.println("Processo: " + processo[i]);
            System.out.println("Tempo di arrivo: " + tArrivo[i]);
            System.out.println("Tempo di Esecuzione: " + tEse[i]);
            System.out.println("Tempo di servizio: " + tServizio[i]);
            System.out.println("Tempo di attesa: " + tAttesa[i]);
        }

        // Calcolo e stampa della media dei tempi di attesa
        System.out.println("Media tempi di attesa: " + media);
    }
}
