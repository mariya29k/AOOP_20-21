package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Set scene
        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);

        double width = scene.getWidth();
        double height = scene.getHeight();
        double centerX = width / 2.0;
        double centerY = height / 2.0;
        int space = 20;

        double x = space,
                y = space;

        // top line
        while (x < centerX) {
            Line line1 = new Line(width - x, y, x, y);
            line1.setStroke(Color.BLUE);
            line1.setStrokeWidth(2);
            group.getChildren().add(line1);
            x += space;
            y += space;
        }

        x = space;
        y = space;

        // left line
        while (y < centerY) {
            Line line2 = new Line(x, y, x, height - y);
            line2.setStroke(Color.BLUE);
            line2.setStrokeWidth(2);
            group.getChildren().add(line2);
            x += space;
            y += space;
        }

        x = space;
        y = space;

        //right line
        while (x <= centerX - space) {
            Line line3 = new Line(width - space - x, height - y, width - space - x, y + space);
            line3.setStroke(Color.BLUE);
            line3.setStrokeWidth(2);
            group.getChildren().add(line3);
            x += space;
            y += space;
        }

        x = space;
        y = space;

        //bottom line
        while (y <= centerY - space) {
            Line line4 = new Line(x, height - y, width - x - space, height - y);
            line4.setStroke(Color.BLUE);
            line4.setStrokeWidth(2);
            group.getChildren().add(line4);
            y += space;
            x += space;
        }

        //Set stage
        primaryStage.setTitle("Squared shaped spiral");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
