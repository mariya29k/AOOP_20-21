module org.openjfx {
    requires javafx.fxml;
    requires javafx.controls;
    opens org.openjfx to javafx.fxml;
    exports org.openjfx to javafx.graphics;
}