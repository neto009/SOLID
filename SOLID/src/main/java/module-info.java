module com.example.solid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solid to javafx.fxml;
    exports com.example.solid;
}