package sample;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.time.LocalDate;
import java.time.Month;
import java.time.Year;


import java.util.Optional;


public class Main extends Application {

    int month = readUserInputMonth();
    int year = readUserInputYear();
    String nameOfMonth = LocalDate.of(year, month,1).getMonth().name();

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,60,60));

    //---------------PRINT-----------------------------------------------------------------
        Text text = new Text(50, 50, " S  M  T  W  T  F  S" );
        text.setFill(Color.RED);
        pane.getChildren().add(text);

        //print spaces for when the month starts for example on Wednesday
        String space = "";
        for (int i = 0; i < getStartingDay(month, year); i++) {
            space += "     ";
            Text text1 = new Text (5, 5, space);
            pane.getChildren().add(text1);
        }

        //print days of month
        for (int i = 0; i <= getNumberOfDays(month, year) - 1 ; i++){
            //new line for new week
            for (int j = i+1; j < 7; j ++) {
                String numberOfDay = Integer.toString(i+1);
                Text text1 = new Text(2,2,numberOfDay);
                text1.setFill(Color.BLACK);
                pane.getChildren().add(text1);
            }
            //new line
        }
        //--------END OF PRINT--------------------------------------------------

        Scene scene = new Scene(pane);
        primaryStage.setTitle(String.format("Calendar for %s, %4d", nameOfMonth,year ));
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private int getNumberOfDays(int month, int year) {
        return Month.of(month).length(Year.of(year).isLeap());
    }
    private int getStartingDay(int month, int year) {
        return LocalDate.of(year, month, 1).getDayOfWeek().getValue();
    }


    private int readUserInputMonth() {
        int month = -1;

        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Month");
        inputDialog.setHeaderText(null);
        inputDialog.setContentText("Enter a month: ");

        boolean invalid = true;
        do {
            Optional<String> userInputOptional = inputDialog.showAndWait();
            if (userInputOptional.isPresent()) {
                month = Integer.parseInt(userInputOptional.get());
                invalid = month < 1 || month > 12;
                if (invalid) {
                    showErrorDialog(month);
                }
            } else {
                return month;
            }
        } while (invalid);

        return month;
    }

    private int readUserInputYear() {
        int year = -1;
        TextInputDialog userInput = new TextInputDialog();
        userInput.setTitle("Year");
        userInput.setHeaderText(null);
        userInput.setContentText("Enter an year: ");

        boolean helper = true;
        do {
            Optional<String> userInputOptional = userInput.showAndWait();
            if (userInputOptional.isPresent()) {
                year = Integer.parseInt(userInputOptional.get());
                helper = year < 0;
                if (helper) {
                    showErrorDialog(year);
                }
            } else {
                return year;
            }
        } while (helper);

        return year;
    }

    private void showErrorDialog(int date) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText(String.format("Please enter a value in [1, 12] for months and a positive value for year. ",date));
        alert.showAndWait();
    }


}
