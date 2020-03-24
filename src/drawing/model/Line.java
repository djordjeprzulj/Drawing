package drawing.model;

public class Line {

    private Point startPoint;
    private Point endPoint;
    private boolean selected;

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

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double length() {
        return this.startPoint.distance(this.endPoint);
    }
}
