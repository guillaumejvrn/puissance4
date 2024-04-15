module fr.pepito.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.pepito.demo to javafx.fxml;
    exports fr.pepito.demo;
}