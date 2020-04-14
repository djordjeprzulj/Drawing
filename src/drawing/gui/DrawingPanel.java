package drawing.gui;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(100, 100, 200, 200);
    }
}
