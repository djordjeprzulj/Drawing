package drawing.test;

import drawing.exceptions.CircleException;
import drawing.model.*;

import java.util.ArrayList;
import java.util.Collection;
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

        Point[] arrayOfPoints = {p1, p2, p5};
        for (Point point : arrayOfPoints) {
            System.out.println(point);
        }

        ArrayList<Point> listOfPoints = new ArrayList<>();
        listOfPoints.add(p5);
        listOfPoints.add(p1);
        for (Point point : listOfPoints) {
            System.out.println(point);
        }

        Object[] objects = new Object[3];
        objects[0] = new Point(5, 7);
        objects[1] = new Line(new Point(1, 0), new Point(5, 0));
        objects[2] = new Circle(new Point(5, 7), 6);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
            /*
            if (objects[i] instanceof Point)
                System.out.println(((Point)objects[i]).toString());
            else if (objects[i] instanceof Line)
                System.out.println(((Line)objects[i]).toString());
            else if (objects[i] instanceof Circle)
                System.out.println(((Circle)objects[i]).toString());

             */
        }
        /*
        Donut d1 = new Donut(p1, 55, 22);
        Donut d2 = new Donut(p1, 60, 20);
        if (d1.compareTo(d2) == 0) {
            System.out.println("d1 i d2 imaju iste povrsine");
        } else if(d1.compareTo(d2) > 0) {
            System.out.println("d1 ima vecu povrsinu od d2");
        } else {
            System.out.println("d1 ima manju povrsinu od d2");
        }
         */
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Point(100, 200));
        shapes.add(new Line(new Point(100, 100), new Point(200, 200)));
        shapes.add(new Circle(new Point(100, 100), 200));
        shapes.add(new Rectangle(new Point(300, 300), 300, 200));
        for (Shape shape : shapes) {
            System.out.println(shape.contains(100, 200));
        }

        ArrayList<Movable> movables = new ArrayList<>();
        movables.addAll(shapes);
        for (Movable movable : movables) {
            movable.moveBy(20, 30);
        }

        Donut donut = new Donut(p1, 300, 100);
        try {
            System.out.println("Upisite vrednost za unutrasnji poluprecnik:");
            Scanner scanner = new Scanner(System.in);
            String strInnerRadius =  scanner.nextLine();
            int innerRadius = Integer.parseInt(strInnerRadius);
            donut.setInnerRadius(innerRadius);

            System.out.println("Upisite vrednost za spoljni poluprecnik:");
            scanner = new Scanner(System.in);
            String strRadius = scanner.nextLine();
            int radius = Integer.parseInt(strRadius);
            donut.setRadius(radius);

        } catch(NumberFormatException nfe) {
            System.out.println("Greska pri konverziji u int " + nfe.getMessage());
        } catch(CircleException cex) {
            System.out.println(cex.getMessage() + " Circle: " + cex.getCircle());
        } catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
