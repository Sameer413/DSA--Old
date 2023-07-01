package Swingg;

import javax.swing.*;
import java.awt.*;

public class JCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JCheckBox box = new JCheckBox();
        JCheckBox box1 = new JCheckBox();
        JCheckBox box2 = new JCheckBox();

        frame.setVisible(true);
    }
}
