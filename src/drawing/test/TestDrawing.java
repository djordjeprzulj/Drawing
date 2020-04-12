package drawing.test;

import javax.swing.*;

public class TestDrawing {


    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().add(new TestPanel());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10, 10, 800, 600);
        f.setVisible(true);
    }
}
