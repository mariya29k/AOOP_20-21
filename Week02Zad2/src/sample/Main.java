package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group(); // Create a layout Panel
        Scene scene = new Scene(group, 300, 250);// Create the Scene

        // add content to the Layout panel
        double width = scene.getWidth(); // total width of the scene
        double height = scene.getHeight(); // total width of the scene

        // --> x
        // |
        // v y

        // draw a line from the middle-left to the middle-right
        Line line = new Line(0, height / 2.0, width, height / 2.0);
        line.setStroke(Color.RED);
        line.setStrokeWidth(2);
        group.getChildren().add(line);
        // draw a line from the top-middle to the bottom-middle
        line = new Line(width / 2.0, 0, width / 2.0, height);
        line.setStroke(Color.RED);
        line.setStrokeWidth(2);
        group.getChildren().add(line);

//        drawCircles(group, width, height);
        drawRectangles(group, width, height);

        // Set the title of the Stage(the application window)
        primaryStage.setTitle("Drawing shapes");
        // Add the Scene to the Stage
        primaryStage.setScene(scene);
        // Show the Stage (the application window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void drawCircles(Group group, double width, double height) {
        double x = width / 2.0; // center of screen
        double y = height / 2.0; // center of screen
        double radius = 10;

        for (int i = 0; i < 12; i++) {
            Circle circle = new Circle(x, y, radius);
            circle.setFill(null);
            circle.setStroke(Color.BLACK);
            group.getChildren().add(circle);
            radius += 10;
        }
    }

    private void drawRectangles(Group group, double width, double height) {
        // (x,y)______
        //  |        |
        //  ---------
        double rectWidth = 20;
        double rectHeight = 10;
        double x = (width / 2.0) - rectWidth / 2.0;
        double y = (height / 2.0) - rectHeight / 2.0;

        for (int i = 0; i < 12; i++) {
            Rectangle rectangle = new Rectangle(x, y, rectWidth, rectHeight);
            rectangle.setFill(null);
            rectangle.setStroke(Color.BLACK);
            group.getChildren().add(rectangle);
            x -= 10;
            y -= 10;
            rectWidth += 20;
            rectHeight += 20;
        }
    }
}
