module com.example.fxtest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fxtest to javafx.fxml;
    exports com.example.fxtest;
}