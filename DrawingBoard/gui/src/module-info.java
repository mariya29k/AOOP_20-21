module gui {
    requires javafx.fxml;
    requires javafx.controls;
    requires model;

    opens view to javafx.fxml;
    exports view;
}