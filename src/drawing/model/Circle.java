package drawing.model;

import drawing.exceptions.CircleException;

import java.awt.*;
import java.io.Serializable;

public class Circle extends Shape implements Movable, Serializable {

    protected Point center;
    protected int radius;
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

    public void setRadius(int radius) throws CircleException {
        if (radius <= 0) {
            throw new CircleException("Radijus mora biti > 0.", this);
        }
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

    public void draw(Graphics g) {
        g.drawOval(this.center.getX() - this.radius, this.center.getY() - this.radius, 2 * this.radius, 2 * this.radius);
        if (this.selected) {
            g.setColor(Color.BLUE);
            g.drawRect(this.center.getX() - 2, this.center.getY() - this.radius - 2, 4, 4);
            g.drawRect(this.center.getX() - this.radius - 2, this.center.getY()  - 2, 4, 4);
            g.drawRect(this.center.getX() - 2, this.center.getY() + this.radius - 2, 4, 4);
            g.drawRect(this.center.getX() + this.radius - 2, this.center.getY()  - 2, 4, 4);
            g.setColor(Color.BLACK);
        }
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.center.moveBy(byX, byY);
    }
}
