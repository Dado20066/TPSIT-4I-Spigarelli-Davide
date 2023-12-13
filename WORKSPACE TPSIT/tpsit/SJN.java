package it.edu.iisgubbio;

public class SJN {
	


	public static void main(String[] args) {
		// Create the main variables needed
		String [] processo = new String [4];
		int [] arrivo = new int [4];
		int [] esecuzione = new int [4];
		int [] servizio = new int [4];
		int [] attesa = new int [4];

		double mediaAttesa;
		// Insert the value of all processes and put them in position
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
		// Here I create a FOR loop that allows me to calculate all the processes with their positions and values
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

		// In this piece I calculate the service and execution
		// I also calculate the waiting time and then print all the results in the console.

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
