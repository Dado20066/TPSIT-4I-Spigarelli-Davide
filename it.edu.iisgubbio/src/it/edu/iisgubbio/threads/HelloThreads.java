package it.edu.iisgubbio.threads;

public class HelloThreads extends Thread {

	/* un thread in java può essere realizzato in vri modi 
	 * 1) faccio una classe che estende la classe nativa di java thread
	 * che ha due metodi principai: 
	 * START() : fa partire il thread
	 * RUN : contiene i codice che deve essere eseguito dal thread
	 */
	public static void main (String args[]) {
		 HelloThreads t1 = new HelloThreads();
		 t1.start();
	}
	public void run() {
		System.out.println("Hello from a thread");
	}
}
