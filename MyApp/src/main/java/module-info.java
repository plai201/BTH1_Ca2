module com.mycompany.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.myapp to javafx.fxml;
    exports com.mycompany.myapp;
}
