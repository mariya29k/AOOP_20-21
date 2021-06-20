package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import providers.CipherGenerator;
import providers.Result;
import providers.Wrapper;

public class Homework6FXSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtSeed;

    @FXML
    private TextField txtSize;

    @FXML
    private Button btnGenerateRandom;

    @FXML
    private Button btnRandomSubset;

    @FXML
    private Button btnQuit;

    private void dialogueAlert(String title, String header, String content){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    //диалогов прозорец с елементите на масива от символи, генериран от доставчика
    //makeFixedRandom () на тази услуга заедно с броя на неповтарящите се символи в
    //този масив.
    @FXML
    void btnGenerateRandomOnAction(ActionEvent event) {
        int size = Integer.parseInt(txtSize.getText());
        int seed = Integer.parseInt(txtSize.getText());

        Wrapper wrapper = new Wrapper(size);
        Result result = CipherGenerator.countDistinct(wrapper.makeFixedRandom(), seed);
        dialogueAlert("Generate random subset A-Z", "Count distinct characters out of " + size, result.toString());
    }


    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnRandomSubsetOnAction(ActionEvent event) {
        int size = Integer.parseInt(txtSize.getText());
        int seed = Integer.parseInt(txtSize.getText());

        Wrapper wrapper = new Wrapper(size);
        Result result = CipherGenerator.countDistinct(wrapper.makeFixedSelection(), seed);
        dialogueAlert("Random subsequence of letters A-Z", "Count distinct characters out of " + size, result.toString());
    }

    @FXML
    void initialize() {
        assert txtSeed != null : "fx:id=\"txtSeed\" was not injected: check your FXML file 'Homework6FXScene.fxml'.";
        assert txtSize != null : "fx:id=\"txtSize\" was not injected: check your FXML file 'Homework6FXScene.fxml'.";
        assert btnGenerateRandom != null : "fx:id=\"btnGenerateRandom\" was not injected: check your FXML file 'Homework6FXScene.fxml'.";
        assert btnRandomSubset != null : "fx:id=\"btnRandomSubset\" was not injected: check your FXML file 'Homework6FXScene.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'Homework6FXScene.fxml'.";

    }
}
