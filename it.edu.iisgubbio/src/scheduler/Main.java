package scheduler;

// Classe principale che avvia il programma
public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 3, 6, 5, 8};

        // Creazione di un oggetto MinimoThread e avvio del thread
        MinimoThread minimoThread = new MinimoThread(array);
        minimoThread.start();
    }
}

// Classe per il thread che calcola il minimo nell'array
class MinimoThread extends Thread {
    private int[] array;

    public MinimoThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int minimo = trovaMinimo(array);
        System.out.println("Il minimo nell'array è: " + minimo);
    }

    private int trovaMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }
}
