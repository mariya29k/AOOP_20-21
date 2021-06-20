package sample;

import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            double x = (i+1) * random.nextInt(101);
            double y = (i + 1) * random.nextInt(101);
            double width = 1 + random.nextInt(100);
            double height = 1 + random.nextInt(100);

            Rectangle rectangle = new Rectangle(new Point(new double[] {x,y}), width, height);
            rectangle.draw(root);

            drawRectangleDiagonals(rectangle, root);
        }


        primaryStage.setTitle("Geometry");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private void drawRectangleDiagonals(Rectangle rectangle, Group root) {
        double x = rectangle.getUPoint().getCoordinates()[0];
        double y = rectangle.getUPoint().getCoordinates()[1];
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        Point firstPoint = rectangle.getUPoint(); //upper left corner
        Point secondPoint = new Point(new double[] {x + width,y}); //upper right
        Point thirdPoint = new Point(new double[] {x+width, y+height}); //bottom right
        Point fourthPoint = new Point(new double[]{x, y+height}); //bottom left

        Line firstDiagonal = new Line(firstPoint, thirdPoint);
        Line secondDiagonal = new Line(secondPoint, fourthPoint);

        firstDiagonal.draw(root);
        secondDiagonal.draw(root);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
