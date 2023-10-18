package it.edu.iisgubbio.tpsit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Primoesercizio extends Application {
	/*  2 Label
	 * 1 TextField
	 * 1 Button
	 */
	Label lNumero =new Label("Inserisci i numeri");
	Label lRis =new Label("");
	
	TextField tNumeri =new TextField("");
	
	Button bSomma =new Button ("Somma");
	Button bProdotto =new Button ("Prodotto");
	
	public void start(Stage finestra){
	
		GridPane griglia =new GridPane();
		griglia.add(lNumero, 0, 0);
		griglia.add(tNumeri, 1, 0);
		griglia.add(bSomma, 0, 1);
		griglia.add(bProdotto, 1, 1);
		griglia.add(lRis, 0, 2);
		
		
		bSomma.setOnAction(e-> somma());
		bProdotto.setOnAction(e-> prodotto());
		
		
		Scene scena = new Scene(griglia);
		finestra.setTitle("Somma e Prodotto");
		finestra.setScene(scena);
		finestra.show();
	}
	private void somma() {
			
		
	}
	
private void prodotto() {
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
