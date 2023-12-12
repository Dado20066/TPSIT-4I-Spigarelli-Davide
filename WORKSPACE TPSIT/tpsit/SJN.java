package it.edu.iisgubbio;

public class SJN {
	


	public static void main(String[] args) {
		//Creo le variabili principali che mi servono 
		String [] processo = new String [4];
		int [] arrivo = new int [4];
		int [] esecuzione = new int [4];
		int [] servizio = new int [4];
		int [] attesa = new int [4];

		double mediaAttesa;
		//Vado a inserire il valore di tutti i processi e ci metto la posizione
		processo[0] = "P0";
		processo[1] = "P1";
		processo[2] = "P2";
		processo[3] = "P3";

		esecuzione[0] = 5;
		esecuzione[1] = 3;
		esecuzione[2] = 8;
		esecuzione[3] = 6;
		
		for(int x = 0; x<4; x++) {
			arrivo[x]=x;
		}
		
//		---------------------------------------------
		int ultimo = esecuzione.length-1;
		// Qui vado a creare un FOR che mi permette di andar a calcolare tutti i processi con le loro posizioni e i loro valori
		for(int superficie=0;superficie<=ultimo-1;superficie=superficie+1){
			for(int posizione=ultimo-1;posizione>=superficie;posizione--){
				if(esecuzione[posizione]>esecuzione[posizione+1]){
					
					int appoggioEsecuzione=esecuzione[posizione];
					String appoggioProcesso = processo[posizione];
					int appoggioArrivo = arrivo[posizione];
					
					esecuzione[posizione]=esecuzione[posizione+1];
					processo[posizione]=processo[posizione+1];
					arrivo[posizione]=arrivo[posizione+1];
					
					esecuzione[posizione+1]=appoggioEsecuzione;
					processo[posizione+1]=appoggioProcesso;
					arrivo[posizione+1]=appoggioArrivo;
				}
			}
		}
//		---------------------------------------------

		// In questo pezzo vado a calcolare il servizio e l'esecuzione
		//Vado a calcolare dopo anche l'attesa per poi andar a stampare nella consolle tutti i risultati.

		for(int y = 0; y<4; y++) {
			if(y==0) {

				servizio[0]= 0;

				attesa[0]=0;

			}else {

				servizio[y]=servizio[y-1]+esecuzione[y-1];

				attesa[y] =  servizio[y]-arrivo[y];
			}
		}

		mediaAttesa =(double)(attesa[0]+attesa[1]+attesa[2]+attesa[3])/4;

		for(int i = 0; i<=3; i++) {
			System.out.println(processo[i]);
		}
		
		System.out.println("processi");
		
		for(int i = 0; i<=3; i++) {
			System.out.println(esecuzione[i]);
		}
		

		System.out.println("esecuzioni");
		
		
		for(int i = 0; i<=3; i++) {
			System.out.println(servizio[i]);
		}

		System.out.println("servizi");
		
		for(int i = 0; i<=3; i++) {
			System.out.println(attesa[i]);
		}

		System.out.println("attese");
		
		
		System.out.println("la media attesa è: "+mediaAttesa);


	}
}
