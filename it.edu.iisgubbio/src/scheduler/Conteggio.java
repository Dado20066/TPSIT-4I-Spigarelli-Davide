package scheduler;

public class Conteggio extends Thread {
	int n;
	String nome;
	Conteggio(int n,String nome){
		this.n=n;
		this.nome=nome;
		
	}
	@Override
	public void run () {
		System.out.println(nome);
		for (int i=n;i<n+10;i++) {
			System.out.println(i+1+" ");
		}
	}

}
