module com.pbo.kalkulator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pbo.kalkulator to javafx.fxml;
    exports com.pbo.kalkulator;
}
