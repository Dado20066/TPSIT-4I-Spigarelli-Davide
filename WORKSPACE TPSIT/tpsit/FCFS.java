package it.edu.iisgubbio;

public class FCFS { 

	public static void main(String[] args) {

		String[] Processo = new String[4];
		int[] tArrivo = new int [4];
		int[] tTempodiEsecuzione = new int [4];
		int[] tTempodiServizio= new int [4]; 
		int[] tTempodiAttesa = new int [4]; 
		double media; 


		Processo[0] = "P0";
		Processo[1] = "P1";
		Processo[2] = "P2";
		Processo[3] = "P3";

		tArrivo[0] = 0;
		tArrivo[1] = 1;
		tArrivo[2] = 2;
		tArrivo[3]  = 3;

		tTempodiEsecuzione[0] = 5;
		tTempodiEsecuzione[1] = 3;
		tTempodiEsecuzione[2] = 8;
		tTempodiEsecuzione[3] = 6;

		//tempo di esecuzione - tempo do arrivo
		
		for(int i=0;i<=0;i++) {
			tTempodiAttesa[i]=tTempodiEsecuzione[i]-tArrivo[i];
		}
		for(int i=0;i<=0;i++) {
			tTempodiServizio[i]=tTempodiServizio[-1];
		}
		System.out.println();

	}
}
