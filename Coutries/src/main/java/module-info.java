module com.mycompany.coutries {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.coutries to javafx.fxml;
    exports com.mycompany.coutries;
}
