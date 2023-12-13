package it.edu.iisgubbio.threads;

/* Lanciare due thread uno che scrive
 * i numeri da 1 a 10 e l'altro che 
 * scrive i numeri da 50 a 100
 * 
 * Dato che abbiamo implementato un unica classe ch eimplementa un thread,
 * per distinguere i due hread occorre passare al costruttore una variabile di selezione
 */

public class Conta extends Thread {
	int typeThread=0;
	public static void main(String args []) {
		Conta t1 = new Conta(0);
		Conta t2 = new Conta(1);
		t1.start();
		t2.start();
		
	
	} 
	public Conta (int type) {
		typeThread = type;
	}
	
	public void run() {
		if(typeThread==0) {
			for(int i =0; i<=10; i++) {
			System.out.println(i);	
			}
			
		}else {
			for(int i =50; i<=100; i++) {
				System.out.println(i);	
				}
		}
	}
}
