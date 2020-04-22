package drawing.gui;

import drawing.model.Shape;

import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : this.shapes) {
            shape.draw(g);
        }
    }
}
