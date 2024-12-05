module com.example.tarea2_6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea2_6 to javafx.fxml;
    exports com.example.tarea2_6;
}