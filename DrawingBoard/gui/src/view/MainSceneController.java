package view;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MainSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDrawLine;

    @FXML
    private Button btnDrawrRectangle;

    @FXML
    private Pane pnlDrawingBoard;

    private Random random;

    @FXML
    void btnDrawLineOnAction(ActionEvent event) {
        double paneWidth = pnlDrawingBoard.getWidth();
        double paneHeight = pnlDrawingBoard.getHeight();
        double x1 = paneWidth * random.nextDouble(); // 500.30 * [0; 1.0]
        double y1 = paneHeight * random.nextDouble();
        double x2 = paneWidth * random.nextDouble();
        double y2 = paneHeight * random.nextDouble();
        Point sPoint = new Point(new double[]{x1, y1});
        Point ePoint = new Point(new double[]{x2, y2});
        Line line = new Line(sPoint, ePoint);
        line.draw(pnlDrawingBoard);
    }

    @FXML
    void btnDrawrRectangleOnAction(ActionEvent event) {
        double paneWidth = pnlDrawingBoard.getWidth();
        double paneHeight = pnlDrawingBoard.getHeight();
        double x1 = paneWidth * random.nextDouble(); // 500.30 * [0; 1.0]
        double y1 = paneHeight * random.nextDouble();
        double x2 = paneWidth * random.nextDouble();
        double y2 = paneHeight * random.nextDouble();
        Point uPoint = new Point(new double[]{x1, y1});
        Point lPoint = new Point(new double[]{x2, y2});
        Rectangle rectangle = new Rectangle(uPoint, lPoint);
        rectangle.draw(pnlDrawingBoard);
    }

    @FXML
    void initialize() {
        assert btnDrawLine != null : "fx:id=\"btnDrawLine\" was not injected: check your FXML file 'MainScene.fxml'.";
        assert btnDrawrRectangle != null : "fx:id=\"btnDrawrRectangle\" was not injected: check your FXML file 'MainScene.fxml'.";
        assert pnlDrawingBoard != null : "fx:id=\"pnlDrawingBoard\" was not injected: check your FXML file 'MainScene.fxml'.";

        random = new Random();
    }
}
