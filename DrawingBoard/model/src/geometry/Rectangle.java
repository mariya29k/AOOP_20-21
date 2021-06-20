package geometry;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Rectangle extends Point {
    private Point lPoint; // lower point

    public Rectangle(Point uPoint, Point lPoint) {
        setUPoint(uPoint);
        setLPoint(lPoint);
    }

    public Rectangle() {
        this(new Point(), new Point());
    }

    public Rectangle(Rectangle r) {
        this(r.getPoint(), r.getLPoint());
    }

    public Point getUPoint() {
        return getPoint();
    }

    public void setUPoint(Point uPoint) {
        if (uPoint != null) {
            setPoint(uPoint);
        } else {
            setPoint(new Point());
        }
    }

    public Point getLPoint() {
        return new Point(lPoint);
    }

    public void setLPoint(Point lPoint) {
        this.lPoint = lPoint != null ? new Point(lPoint) : new Point();
    }

    public double getWidth() {
        return Math.abs(lPoint.getCoordinates()[0] - getPoint().getCoordinates()[0]);
    }

    public double getHeight() {
        return Math.abs(lPoint.getCoordinates()[1] - getPoint().getCoordinates()[1]);
    }

    public void draw(Pane pane) {
        // (x1,y1)
        //
        //              (x2,y2)
        double width = getWidth();
        double height = getHeight();
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(
                getPoint().getCoordinates()[0], getPoint().getCoordinates()[1], width, height
        );
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().add(rectangle);
    }

    public double measure() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return String.format("uPoint: %s, lPoint: %s", getPoint(), lPoint);
    }
}
