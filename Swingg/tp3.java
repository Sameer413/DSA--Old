package Swingg;

import javax.swing.*;
import java.awt.*;

public class tp3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        ImageIcon icon = new ImageIcon("Swingg/hello.png");
        JButton btn = new JButton(icon);
//        btn.setSize(100,50);
        btn.setSize(icon.getIconWidth(), icon.getIconHeight());
        btn.setLocation(100,100);
        c.add(btn);

        Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
        btn.setCursor(cur);
        btn.setEnabled(true);
        btn.setVisible(true);
//        Font font = new Font("Arial", Font.BOLD, 15);
//        btn.setFont(font);

        frame.setVisible(true);
    }
}
