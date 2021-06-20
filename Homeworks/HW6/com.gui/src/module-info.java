module com.gui {
    requires javafx.fxml;
    requires javafx.controls;
    requires com.providers;

    opens gui to javafx.fxml;
    exports gui to javafx.graphics;
}