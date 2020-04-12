package drawing.model;

public class Circle {

    private Point center;
    private int radius;
    private boolean selected;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, int radius, boolean selected) {
        this(center, radius);
        this.selected = selected;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public boolean contains(Point p) {
        return this.center.distance(p) <= this.radius;
    }

    public boolean contains(int x, int y) {
        return this.contains(new Point(x ,y));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.center.equals(c.center) && this.radius == c.radius;
        }
        return false;
    }

    public String toString() {
        return "Center:" + this.center + ", Radius:" + this.radius;
    }

}
