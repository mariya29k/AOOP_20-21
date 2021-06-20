package geometry;

import javafx.scene.Group;
import javafx.scene.paint.Color;

import javax.swing.*;

public class Rectangle {
    private Point uPoint;
    private double width;
    private double height;

    public Rectangle(Point uPoint, double width, double height) {
        setUPoint(uPoint);
        setWidth(width);
        setHeight(height);
    }
    
    public Rectangle() {
         this(new Point(),1.0, 1.0);
    }
    
    public Rectangle(Rectangle r) {
        this(r.uPoint, r.width, r.height);
    }

    public Point getUPoint (){
        return new Point(uPoint);
    }

    public void setUPoint (Point uPoint){
        this.uPoint = uPoint != null ? new Point(uPoint) : new Point();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 1.0;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 1.0;
    }

    public void draw(Group pane) {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(
                uPoint.getCoordinates()[0], uPoint.getCoordinates()[1], width, height);

        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);

        pane.getChildren().add(rectangle);
    }

    @Override
    public String toString() {
        return String.format("uPoint: %s, width: %.2f, height: %.2f", uPoint, width, height);
    }
}
