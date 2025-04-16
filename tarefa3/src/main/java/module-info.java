module org.exemplo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens org.exemplo to javafx.fxml;
    exports org.exemplo;
}
