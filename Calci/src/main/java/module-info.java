module org.example.calci {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens org.example.calci to javafx.fxml;
    exports org.example.calci;
}