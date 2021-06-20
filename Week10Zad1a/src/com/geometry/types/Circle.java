package com.geometry.types;

public class Circle extends Point{
    private int radius;

    public Circle(Point other, int radius) {
        super(other);
        setRadius(radius);
    }

    public Circle(){
        this(new Point(), 1);
    }

    public Circle(Circle circle) {
        this(circle.getCenter(), circle.getRadius());
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius < 0 ? 1 : radius;
    }

    public Point getCenter(){
        return  new Point(getX(), getY());
    }

    @Override
    public String toString() {
        return String.format("Center: %s, Radius: %d", super.toString(), radius);
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        }

        if (!(o instanceof Circle)) {
            return 1;
        }

        Circle circle = (Circle) o;
        int result = super.compareTo(o);

        if (result != 0) {
            return result;
        }

        return radius - circle.radius;
    }
}
