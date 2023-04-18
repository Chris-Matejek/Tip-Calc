module com.mycompany.tipcalc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tipcalc to javafx.fxml;
    exports com.mycompany.tipcalc;
}
