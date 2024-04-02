module com.example.provaangelo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.provaangelo to javafx.fxml;
    exports com.example.provaangelo;
}