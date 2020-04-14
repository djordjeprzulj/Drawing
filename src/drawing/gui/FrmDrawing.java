package drawing.gui;

import javax.swing.*;

public class FrmDrawing {
    private JPanel rootPanel;
    private JButton editButton;
    private JToolBar toolBar;
    private JButton deleteButton;
    private JToggleButton tglSelection;
    private JToggleButton tglPoint;
    private JToggleButton tglLine;
    private JToggleButton tglRectangle;
    private JToggleButton tglCircle;
    private JToggleButton tglDonut;
    private DrawingPanel drawingPanel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FrmDrawing");
        frame.setContentPane(new FrmDrawing().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 800, 600);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        this.drawingPanel1 = new DrawingPanel();
    }
}
