package drawing.model;

import java.awt.*;

public class Line {

    private Point startPoint;
    private Point endPoint;
    private boolean selected;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(Point startPoint, Point endPoint, boolean selected) {
        this(startPoint, endPoint);
        this.selected = selected;
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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
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
    }
}
