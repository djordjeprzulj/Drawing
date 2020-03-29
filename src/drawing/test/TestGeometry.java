package drawing.test;

import drawing.model.Circle;
import drawing.model.Point;
import drawing.model.Rectangle;

public class TestGeometry {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        System.out.println(p1.distance(p2));

        Circle c = new Circle(null, 3);
        System.out.println(c.area());

        Rectangle r = new Rectangle(null, 6, 4);
        System.out.println(r.area());

        // vezba 5
        Point p3 = new Point(5, 6);
        System.out.println("x=" + p3.getX() + ", y=" + p3.getY() + ", " + p3.isSelected());

        Point p4 = new Point(10, 20, true);
        p3.setSelected(p4.isSelected());

        Point p5 = p3;
        p3.setX(9);
        System.out.println(p5.getX());

        Point p6 = new Point(p3.getX(), p3.getY());
    }
}
