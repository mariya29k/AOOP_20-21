package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtResult;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnZero;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnDoubleZero;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnC;

    @FXML
    private Button btnCA;

    @FXML
    private Button btnOff;

    private void showDigit(String digit) {
        String text = txtResult.getText();
        if (text.equals("0")) {
            txtResult.setText(digit);
        } else {
            txtResult.setText(text + digit);
        }
    }

    @FXML
    void btnCAOnAction(ActionEvent event) {

    }

    @FXML
    void btnCOnAction(ActionEvent event) {

    }

    @FXML
    void btnDivideOnAction(ActionEvent event) {

    }

    @FXML
    void btnDotOnAction(ActionEvent event) {

    }

    @FXML
    void btnDoubleZeroOnAction(ActionEvent event) {

    }

    @FXML
    void btnEightOnAction(ActionEvent event) {

    }

    @FXML
    void btnEqualOnAction(ActionEvent event) {

    }

    @FXML
    void btnFiveOnAction(ActionEvent event) {

    }

    @FXML
    void btnFourOnAction(ActionEvent event) {

    }

    @FXML
    void btnMinusOnAction(ActionEvent event) {

    }

    @FXML
    void btnMultiplyOnAction(ActionEvent event) {

    }

    @FXML
    void btnNineOnAction(ActionEvent event) {

    }

    @FXML
    void btnOffOnAction(ActionEvent event) {

    }

    @FXML
    void btnOneOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlusOnAction(ActionEvent event) {

    }

    @FXML
    void btnSevenOnAction(ActionEvent event) {

    }

    @FXML
    void btnSixOnAction(ActionEvent event) {

    }

    @FXML
    void btnThreeOnAction(ActionEvent event) {

    }

    @FXML
    void btnTwoOnAction(ActionEvent event) {

    }

    @FXML
    void btnZeroOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnOne != null : "fx:id=\"btnOne\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnZero != null : "fx:id=\"btnZero\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnNine != null : "fx:id=\"btnNine\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnEight != null : "fx:id=\"btnEight\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSeven != null : "fx:id=\"btnSeven\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSix != null : "fx:id=\"btnSix\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnFive != null : "fx:id=\"btnFive\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnFour != null : "fx:id=\"btnFour\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnTwo != null : "fx:id=\"btnTwo\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDoubleZero != null : "fx:id=\"btnDoubleZero\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnPlus != null : "fx:id=\"btnPlus\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnEqual != null : "fx:id=\"btnEqual\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMinus != null : "fx:id=\"btnMinus\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDivide != null : "fx:id=\"btnDivide\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDot != null : "fx:id=\"btnDot\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMultiply != null : "fx:id=\"btnMultiply\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnC != null : "fx:id=\"btnC\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnCA != null : "fx:id=\"btnCA\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnOff != null : "fx:id=\"btnOff\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
