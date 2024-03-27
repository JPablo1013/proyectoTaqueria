package com.example.proyectotaqueria;

import com.example.proyectotaqueria.vistas.Mesas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private BorderPane bdpPanel;

    @Override
    public void start(Stage stage) throws IOException {
        bdpPanel = new BorderPane(); // Inicializa bdpPanel aquí

        crearMenu(); // Llama a crearMenu() después de inicializar bdpPanel

        Scene scene = new Scene(bdpPanel);
        scene.getStylesheets().add(getClass().getResource("/estilos/styles.css").toString());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();

        //Conexion.crearConexion();
    }

    private void crearMenu() {
        // Crear un TabPane
        TabPane tabPane = new TabPane();

        // Crear pestañas
        Tab tab1 = new Tab("Pestaña 1");
        tab1.setContent(new Mesas()); // Establecer el contenido de la Pestaña 1 como una instancia de Mesas
        Tab tab2 = new Tab("Pestaña 2");
        tab2.setContent(new BorderPane()); // Contenido de la Pestaña 2 (por ejemplo)
        Tab tab3 = new Tab("Pestaña 3");
        tab3.setContent(new BorderPane()); // Contenido de la Pestaña 3 (por ejemplo)

        // Agregar pestañas al TabPane
        tabPane.getTabs().addAll(tab1, tab2, tab3);

        // Agregar el TabPane al panel principal
        bdpPanel.setCenter(tabPane);
    }

    public static void main(String[] args) {
        launch();
    }
}
