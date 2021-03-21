package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import java.util.Optional;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene scene = new Scene (group, 300, 275);

        double centerX = scene.getWidth() / 2.0;
        double centerY = scene.getHeight() / 2.0;
        double radius = Math.min(scene.getWidth(), scene.getHeight()) / 3.0;

        Circle circle = new Circle (centerX, centerY, radius);
        circle.setFill(null);
        circle.setStroke(Color.BLUE);
        group.getChildren().add(circle);

        double lineX = readUserInput(scene.getWidth());

        if (lineX < 0) {
            Platform.exit();

        } else {
            Line line = new Line(lineX, 0, lineX, scene.getHeight());
            line.setStroke(Color.RED);
            line.setStrokeWidth(2);
            group. getChildren().add(line);

            //find intersection points
            double chSquare = radius*radius - (centerX - lineX) * (centerX - lineX);

                if (chSquare >= 0) {
                    double intersectionOneY = centerY - Math.sqrt(chSquare);
                    drawCircleWithText(lineX, intersectionOneY, group);
                    
                    if (chSquare > 0) {
                        double intersectionTwoY = centerY + Math.sqrt(chSquare);
                        drawCircleWithText(lineX, intersectionTwoY, group);
                        
                    }

                    primaryStage.setTitle("Circle Line Intersection");
                    primaryStage.setScene(scene);
                    primaryStage.show();
                } else {
                    showWarningDialog();
                    Platform.exit();
                }
        }
    }



    public static void main(String[] args) {
        launch(args);
    }

    private double readUserInput(double width) {
        double userInput = -1;

        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Prompt");
        inputDialog.setHeaderText(null);
        inputDialog.setContentText("Enter x coordinate for AB line: ");

        boolean invalid = true;

        do {
            Optional<String> userInputOptional = inputDialog.showAndWait();
            if (userInputOptional.isPresent()) {
                userInput = Double.parseDouble(userInputOptional.get());
                invalid = userInput < 0 || userInput > width;
                if (invalid) {
                    showErrorDialog(width);
                }
            } else {
                return userInput;
            }
        } while (invalid);

        return userInput;
    }

    private void showErrorDialog(double width) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText(String.format("Please enter a value in [0, %.2f]",width));
        alert.showAndWait();
    }

    private void showWarningDialog() {
        Alert alert = new Alert (Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("No intersection.");
        alert.showAndWait();
    }

    private void drawCircleWithText(double x, double y, Group group) {
        Circle circle = new Circle(x, y, 5);


        Text label = new Text(x + 10, y, String.format("(%.2f, %.2f)", x, y));
        group.getChildren().addAll(circle,label);
    }
}
