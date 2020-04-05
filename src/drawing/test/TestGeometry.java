package drawing.test;

import drawing.model.Circle;
import drawing.model.Donut;
import drawing.model.Point;
import drawing.model.Rectangle;

import java.util.Scanner;

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
        System.out.println("x=" + p3.getX() + ", y=" + p3.getY() + ", selected=" + p3.isSelected());

        Point p4 = new Point(10, 20, true);
        p3.setSelected(p4.isSelected());

        Point p5 = p3;
        p3.setX(9);
        System.out.println(p5.getX());

        Point p6 = new Point(p3.getX(), p3.getY());
/*
        System.out.println("Upisite parametre za kreiranje tacke:");
        Scanner scanner = new Scanner(System.in);
        String pointInput = scanner.nextLine();
        String[] coordinates = pointInput.split(" ");
        int inputX = Integer.parseInt(coordinates[0]);
        int inputY = Integer.parseInt(coordinates[1]);
        boolean selected = false;
        if (coordinates.length == 3) {
            selected = Boolean.parseBoolean(coordinates[2]);
        }
        Point pointFromInput = new Point(inputX, inputY, selected);
        System.out.println("x=" + pointFromInput.getX() + ", y=" + pointFromInput.getY() + ", selected=" + pointFromInput.isSelected());
 */
        Donut d1 = new Donut(new Point(10, 20), 30, 20);
        Donut d2 = new Donut(new Point(10, 20), 30, 20);
        System.out.println(d1.equals(d2));
    }
}
