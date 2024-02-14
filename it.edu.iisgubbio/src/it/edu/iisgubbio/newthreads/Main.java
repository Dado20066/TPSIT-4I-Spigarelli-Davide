package it.edu.iisgubbio.newthreads;

public class Main {
    public static void main(String args[]) {
        int[] numeriThread1 = {};
        CustomThread c1 = new CustomThread(numeriThread1);
        c1.start();

        int[] numeriThread2 = {};
        CustomThread c2 = new CustomThread(numeriThread2);
        c2.start();
    }
}
