module com.example.tp1_pokecarte {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1_pokecarte to javafx.fxml;
    exports com.example.tp1_pokecarte;
}