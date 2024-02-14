package scuola.gubbio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * La classe Video è un'applicazione JavaFX che implementa un algoritmo di scheduling.
 */
public class Video extends Application {

    private List<String> variabili = new ArrayList<>(); // Lista delle variabili
    private int turnoCorrente = 1; // Numero del turno corrente

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Creazione della griglia per l'interfaccia grafica
        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(10);

        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setPercentWidth(100);
        root.getColumnConstraints().add(columnConstraints);

        // Creazione del pulsante "Pianifica"
        Button scheduleButton = new Button("Pianifica");
        scheduleButton.setOnAction(e -> pianificaVariabili());
        root.add(scheduleButton, 0, 0);

        // Creazione della scena e visualizzazione della finestra
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Algoritmo di Scheduling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Metodo per la pianificazione delle variabili.
     */
    private void pianificaVariabili() {
        if (turnoCorrente == 1) {
            // Mette tutte le variabili in fila al primo giro
            variabili.clear();
            variabili.add("Variabile 1");
            variabili.add("Variabile 2");
            variabili.add("Variabile 3");
            variabili.add("Variabile 4");
            variabili.add("Variabile 5");
            variabili.add("Variabile 6");
            variabili.add("Variabile 7");
    
        } else {
            // Mette le variabili in ordine casuale dal secondo giro in poi
            Collections.shuffle(variabili);
        }

        System.out.println("Turno " + turnoCorrente + ": " + variabili); // Stampa delle variabili per il turno corrente
        turnoCorrente++;

        if (turnoCorrente == 3) {
            // Termina l'esecuzione dopo il terzo turno
            ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
            executor.schedule(() -> System.exit(0), 30, TimeUnit.SECONDS);
            executor.shutdown();
        }
    }
}