package drawing.test;

import drawing.model.Line;
import drawing.model.Point;

import javax.swing.*;
import java.awt.Graphics;

public class TestPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Line l1 = new Line(new Point(100, 100), new Point (200, 200));
        Line l2 = new Line(new Point(300, 300), new Point (400, 400));
        super.paint(g);
        l1.draw(g);
        l2.draw(g);

    }
}
