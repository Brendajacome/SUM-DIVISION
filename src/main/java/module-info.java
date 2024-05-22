module com.example.miprimerproyecto1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miprimerproyecto1 to javafx.fxml;
    exports com.example.miprimerproyecto1;
}