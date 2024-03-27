package com.example.proyectotaqueria.vistas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Mesas extends Pane {

    public Mesas() {
        CrearUI();
    }

    private void CrearUI() {
        // Crear un GridPane para organizar los botones
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));

        // Crear y agregar botones al GridPane
        int numFilas = 5;
        int numColumnas = 5;
        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                Button botonMesa = new Button("Mesa " + ((fila * numColumnas) + columna + 1));
                botonMesa.setPrefSize(80, 80);
                gridPane.add(botonMesa, columna, fila);
            }
        }

        // Establecer el GridPane como contenido de este Pane
        getChildren().add(gridPane);
    }
}
