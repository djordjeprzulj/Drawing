package drawing.model;

public class Rectangle {

    private Point upperLeft;
    private int width;
    private int height;
    private boolean selected;

    public Rectangle(Point upperLeft, int width, int height) {
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point upperLeft, int width, int height, boolean selected) {
        this(upperLeft, width, height);
        this.selected = selected;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double area() {
        return this.width * this.height;
    }

    public boolean contains(Point p) {
        boolean containsX = p.getX() > this.upperLeft.getX() && p.getX() < this.upperLeft.getX() + this.width;
        boolean containsY = p.getY() > this.upperLeft.getY() && p.getY() < this.upperLeft.getY() + this.height;
        return containsX && containsY;
    }

    public boolean contains(int x, int y) {
        return contains(new Point(x, y));
    }

    public Point getLowerRight() {
        return new Point(this.upperLeft.getX() + this.width, this.upperLeft.getY() + this.height);
    }
}
