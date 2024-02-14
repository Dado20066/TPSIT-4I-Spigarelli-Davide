package it.edu.iisgubbio.newthreads;

public class CustomThread extends Thread {
    private int[] numeri;

    public CustomThread(int[] numeri) {
        this.numeri = numeri;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (contieneNumero(i)) {
                System.out.println(i);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean contieneNumero(int num) {
        for (int n : numeri) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] mieiNumeri = {2, 4, 6, 8, 10};
        CustomThread customThread = new CustomThread(mieiNumeri);
        customThread.start();
    }
}


/* dato un vettore di 5 numeri tra 1 e 10 diversi, 
 * il thread deve stampare solo se il numero del ciclo è sul vettore che io gli passo*/
 
 
 // una volta realizzato si deve fare due ulm corripsondenti