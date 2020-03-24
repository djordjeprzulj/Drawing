package drawing.test;

import drawing.model.Circle;
import drawing.model.Point;
import drawing.model.Rectangle;

public class TestGeometry {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p2.setX(3);
        p2.setY(4);
        System.out.println(p1.distance(p2));

        Circle c = new Circle();
        c.setRadius(3);
        System.out.println(c.area());

        Rectangle r = new Rectangle();
        r.setWidth(6);
        r.setHeight(4);
        System.out.println(r.area());
    }
}
