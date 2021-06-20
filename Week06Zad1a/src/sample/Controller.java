package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtGcd;

    @FXML
    private Label lblA;

    @FXML
    private Label lblB;

    @FXML
    private Label lblGCD;

    @FXML
    private Button btnComputeGCD;

    @FXML
    private Button btnQuit;

    @FXML
    void btnComputeGCDOnAction(ActionEvent event) {
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        txtGcd.setText(String.format("%d", computeGcd(a, b)));
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void initialize() {
        assert txtA != null : "fx:id=\"txtA\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtB != null : "fx:id=\"txtB\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtGcd != null : "fx:id=\"txtGcd\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblA != null : "fx:id=\"lblA\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblB != null : "fx:id=\"lblB\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblGCD != null : "fx:id=\"lblGcd\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnComputeGCD != null : "fx:id=\"btnComputeGcd\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'sample.fxml'.";

    }

    private int computeGcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return computeGcd(b, a % b);
    }
}
