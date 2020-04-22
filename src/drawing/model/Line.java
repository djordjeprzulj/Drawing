package drawing.model;

import java.awt.*;

public class Line extends Shape implements Movable {

    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(Point startPoint, Point endPoint, boolean selected) {
        super(selected);
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public double length() {
        return this.startPoint.distance(this.endPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  Line) {
            Line l = (Line) obj;
            return this.startPoint.equals(l.startPoint);
        }
        return false;
    }

    public String toString() {
        return "Start:" + this.startPoint + ", End:" + this.endPoint;
    }

    public void draw(Graphics g) {
        g.drawLine(this.startPoint.getX(), this.getStartPoint().getY(), this.endPoint.getX(), this.endPoint.getY());
        if (this.selected) {
            g.setColor(Color.BLUE);
            g.drawRect(this.startPoint.getX() - 2, this.startPoint.getY() - 2, 4, 4);
            g.drawRect(this.endPoint.getX() - 2, this.endPoint.getY() - 2, 4, 4);
            g.setColor(Color.BLACK);
        }
    }

    @Override
    public boolean contains(int x, int y) {
        return this.startPoint.distance(new Point(x, y)) + this.endPoint.distance(new Point(x, y)) - this.length() <= 3.0D;
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.startPoint.moveBy(byX, byY);
        this.endPoint.moveBy(byX, byY);
    }
}
