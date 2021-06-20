package geometry;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Line extends Point {
    private Point ePoint;

    public Line(Point sPoint, Point ePoint) {
        setSPoint(sPoint);
        setEPoint(ePoint);
    }

    public Line() {
        this(new Point(), new Point(new double[]{1.0, 1.0}));
    }

    public Line(Line l) {
        this(new Point(l.getPoint()), l.ePoint);
    }

    public Point getSPoint() {
        return new Point(getPoint());
    }

    public void setSPoint(Point sPoint) {
        if (sPoint != null) {
            setPoint(sPoint);
        } else {
            setPoint(new Point());
        }
    }

    public Point getEPoint() {
        return new Point(ePoint);
    }

    public void setEPoint(Point ePoint) {
        this.ePoint = ePoint != null ? new Point(ePoint) : new Point();
    }

    public void draw(Pane pane) {
        javafx.scene.shape.Line line = new javafx.scene.shape.Line(getPoint().getCoordinates()[0],
                getPoint().getCoordinates()[1], ePoint.getCoordinates()[0], ePoint.getCoordinates()[1]);
        line.setStroke(Color.RED);
        pane.getChildren().add(line);
    }

    public double measure() {
        double x1 = getPoint().getCoordinates()[0];
        double y1 = getPoint().getCoordinates()[1];
        double x2 = ePoint.getCoordinates()[0];
        double y2 = ePoint.getCoordinates()[1];

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    @Override
    public String toString() {
        return String.format("sPoint: %s, ePoint: %s", getPoint(), ePoint);
    }
}
