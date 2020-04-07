package drawing.model;

public class Donut extends Circle {

    private int innerRadius;

    public Donut(Point center, int radius, int innerRadius) {
        super(center, radius);
        this.innerRadius = innerRadius;
    }

    public Donut(Point center, int radius, boolean selected, int innerRadius) {
        super(center, radius, selected);
        this.innerRadius = innerRadius;
    }

    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    @Override
    public double area() {
        return super.area() - this.innerRadius * innerRadius * Math.PI;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Donut) {
            Donut d = (Donut) obj;
            return super.equals(d) && this.innerRadius == d.innerRadius;
        }
        return false;
    }

    public String toString() {
        return super.toString() + ", Inner radius:" + this.innerRadius;
    }
}
