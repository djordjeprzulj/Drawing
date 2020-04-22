package drawing.gui;

import drawing.model.Shape;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmDrawing {
    private JPanel rootPanel;
    private JToolBar toolBar;
    private JButton editButton;
    private JButton deleteButton;
    private JToggleButton tglSelection;
    private JToggleButton tglPoint;
    private JToggleButton tglLine;
    private JToggleButton tglRectangle;
    private JToggleButton tglCircle;
    private JToggleButton tglDonut;
    private DrawingPanel drawingPanel1;

    public FrmDrawing() {
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        drawingPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                panelClicked(e);
            }
        });
    }

    private void panelClicked(MouseEvent e) {
        if (this.tglSelection.isSelected()) {
            Shape selection = null;
            for (Shape shape : this.drawingPanel1.getShapes()) {
                shape.setSelected(false);
                if (shape.contains(e.getX(), e.getY())) {
                    selection = shape;
                }
            }
            if (selection != null) {
                selection.setSelected(true);
            }
        } else if (this.tglCircle.isSelected()) {
            DlgCircle dlg = new DlgCircle();
            dlg.setVisible(true);
            this.drawingPanel1.getShapes().add(dlg.getCircle());

        }
        this.drawingPanel1.repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing");
        frame.setContentPane(new FrmDrawing().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.pack();
        frame.setBounds(100, 100, 800, 600);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        this.drawingPanel1 = new DrawingPanel();
    }
}
