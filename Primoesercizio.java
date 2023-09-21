package it.edu.iisgubbio.tpsit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Primoesercizio extends Application {

	Label lNumero =new Label("Inserisci i numeri");
	Label lRis =new Label("");

	TextField tNumeri =new TextField("");
	TextField tNumeri2 =new TextField("");

	Button bSomma =new Button ("Somma");
	Button bProdotto =new Button ("Prodotto");

	public void start(Stage finestra){

		GridPane griglia =new GridPane();
		griglia.add(lNumero, 0, 0);
		griglia.add(tNumeri, 1, 0);
		griglia.add(tNumeri2, 2, 0);
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
		int numero1 = Integer.parseInt(tNumeri.getText());
		int numero2 = Integer.parseInt(tNumeri2.getText());

		// Calcola la somma e il prodotto
		int somma = numero1 + numero2;

		lRis.setText("Somma: " + somma);
	}

	private void prodotto() {
		int numero1=Integer.parseInt(tNumeri.getText());
		int numero2 =Integer.parseInt(tNumeri2.getText());
		
		int prodotto = numero1*numero2;
		
		lRis.setText("Prodotto: "+prodotto);

	}
	public static void main(String[] args) {
		launch(args);
	}
}
