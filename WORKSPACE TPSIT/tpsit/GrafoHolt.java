package it.edu.iisgubbio;

public class GrafoHolt {
	// The attributes of the GrafoHolt class are:
	// the size of the graph and a matrix that represents the graph itself
	int dimension;
	int [][] grafo;
	
	public GrafoHolt(int dimension) {
		// The constructor of the class
		// creates and initializes the matrix that represents
		// the graph
		this.grafo =  new int[dimension][dimension];
		this.dimension=dimension;
		for (int i = 0; i < this.dimension; i++) {
			for (int j = 0; j < this.dimension; j++) {
				 this.grafo[i][j]=0;
				}

			}

	}
	
	public Boolean checkcolum(int resources) {
		// The method checks if the resource has not already been assigned
		int sum = 0;
		for (int i = 0; i < this.dimension; i++) {
			sum = sum  + this.grafo[i][resources];
			}
		if (sum == 0) {
			return (true);
		}
		else {
			return(false);
		}
	}

	public void setRequest(int process, int resources) {
		// The method assigns:
		//      1 assigned resource
		//      2 process waiting

		if (this.grafo[process][resources]==0) {
			if (this.checkcolum(resources)){
				this.grafo[process][resources]=1;
			}
			else {
				this.grafo[process][resources]=2;
			}
		}
		else {
			System.out.print("Assignment not possible");
		}
		
	}
	
	public void print2D() {
		 // Prints the matrix to the console
	        for (int i = 0; i < this.dimension; i++) {
	            for (int j = 0; j < this.dimension; j++) {
	                System.out.print(this.grafo[i][j] + " ");
	            }
	        System.out.print("\n");
	        }
	    }
	
	
	
} 
