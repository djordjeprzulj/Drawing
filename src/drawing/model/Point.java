package drawing.model;

import java.awt.*;
import java.io.Serializable;

public class Point extends Shape implements Movable, Serializable {

    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, boolean selected) {
        super(selected);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.x += byX;
        this.y += byY;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(this.x, this.y, this.x, this.y);
        if (this.selected) {
            g.setColor(Color.BLUE);
            g.drawRect(this.x - 2, this.y - 2, 4, 4);
            g.setColor(Color.BLACK);
        }
    }

    @Override
    public boolean contains(int x, int y) {
        // return this.x == x && this.y == y;
        return this.distance(new Point(x, y)) < 3;
    }
}
