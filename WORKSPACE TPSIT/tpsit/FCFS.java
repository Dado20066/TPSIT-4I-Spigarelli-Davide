package it.edu.iisgubbio;
public class FcFs {
	public static void main(String[] args) {
		
		String [] Posprocesso = new String [4];
		int [] arrivo = new int [4];
		int [] tTempodiEsecuzione = new int [4];
		int [] servizio = new int [4];
		int [] attesa = new int [4];
		
		double mediaAttesa;
		
		Posprocesso[0] = "P0";
		Posprocesso[1] = "P1";
		Posprocesso[2] = "P2";
		Posprocesso[3] = "P3";
		
		tTempodiEsecuzione[0] = 5;
		tTempodiEsecuzione[1] = 3;
		tTempodiEsecuzione[2] = 8;
		tTempodiEsecuzione[3] = 6;
		
		for(int x = 0; x<4; x++) {
			arrivo[x]=x;
		}
		
		for(int y = 0; y<4; y++) {
			if(y==0) {
				
				servizio[0]= 0;
				
				attesa[0]=0;
				
			}else {
				
				servizio[y]=servizio[y-1]+tTempodiEsecuzione[y-1];
				
				attesa[y] = servizio[y]-arrivo[y];
			}
		}
		
		mediaAttesa =(double)(attesa[0]+attesa[1]+attesa[2]+attesa[3])/4;
		
		for(int i = 0; i<=3; i++) {
			System.out.println(Posprocesso[i]);
		}
		
		System.out.println("la media attesa è: "+mediaAttesa);
		
	}
}
