module com.example.proyectotaqueria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.proyectotaqueria to javafx.fxml;
    exports com.example.proyectotaqueria;
}