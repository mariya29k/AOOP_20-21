package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Menu mnuConvert;

    @FXML
    private MenuItem mniDecimal;

    @FXML
    private MenuItem mniHex;

    @FXML
    private MenuItem mniBinary;

    @FXML
    private Menu mnuQuit;

    @FXML
    private MenuItem mniQuit;

    @FXML
    private Button btnDecimal;

    @FXML
    private Button btnBinary;

    @FXML
    private Button btnHex;

    @FXML
    private TextField txtBinary;

    @FXML
    private TextField txtHex;

    @FXML
    private TextField txtDecimal;

    @FXML
    void btnBinaryOnAction(ActionEvent event) {
        convertBinaryText();
    }

    @FXML
    void btnDecimalOnAction(ActionEvent event) {
        convertDecimalText();
    }

    @FXML
    void btnHexOnAction(ActionEvent event) {
        convertHexText();
    }

    @FXML
    void mniBinaryOnAction(ActionEvent event) {
        convertBinaryText();
    }

    @FXML
    void mniDecimalOnAction(ActionEvent event) {
        convertDecimalText();
    }

    @FXML
    void mniHexOnAction(ActionEvent event) {
        convertHexText();
    }

    @FXML
    void mniQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void txtBinaryOnAction(ActionEvent event) {
        convertBinaryText();
    }

    @FXML
    void txtDecimalOnAction(ActionEvent event) {
        convertDecimalText();
    }

    @FXML
    void txtHexOnAction(ActionEvent event) {
        convertHexText();
    }

    @FXML
    void initialize() {
        assert mnuConvert != null : "fx:id=\"mnuConvert\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniDecimal != null : "fx:id=\"mniDecimal\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniHex != null : "fx:id=\"mniHex\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniBinary != null : "fx:id=\"mniBinary\" was not injected: check your FXML file 'sample.fxml'.";
        assert mnuQuit != null : "fx:id=\"mnuQuit\" was not injected: check your FXML file 'sample.fxml'.";
        assert mniQuit != null : "fx:id=\"mniQuit\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDecimal != null : "fx:id=\"btnDecimal\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnBinary != null : "fx:id=\"btnBinary\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnHex != null : "fx:id=\"btnHex\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtBinary != null : "fx:id=\"txtBinary\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtHex != null : "fx:id=\"txtHex\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtDecimal != null : "fx:id=\"txtDecimal\" was not injected: check your FXML file 'sample.fxml'.";

    }

    private void convertBinaryText() {
        String binaryText = txtBinary.getText();
        if (binaryText.length() > 0) {
            int number = Integer.parseInt(binaryText, 2);
            txtDecimal.setText(Integer.toString(number));
            txtHex.setText(Integer.toHexString(number).toUpperCase());
        }
    }

    private void convertDecimalText() {
        String decimalText = txtDecimal.getText();
        if (decimalText.length() > 0) {
            int number = Integer.parseInt(decimalText);
            txtHex.setText(Integer.toHexString(number).toUpperCase());
            txtBinary.setText(Integer.toBinaryString(number));
        }
    }

    private void convertHexText() {
        String hexText = txtHex.getText();
        if (hexText.length() > 0) {
            int number = Integer.parseInt(hexText, 16);
            txtDecimal.setText(Integer.toString(number));
            txtBinary.setText(Integer.toBinaryString(number));
        }
    }
}
