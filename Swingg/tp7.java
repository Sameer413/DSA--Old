package Swingg;

import javax.swing.*;
import java.awt.*;

public class tp7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Hii");
        f.setVisible(true);
        f.setBounds(100,100,1000,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JTextArea t = new JTextArea("hiii");
        t.setBounds(100,100,400,200);
        c.add(t);
        t.setFont(new Font("Arail", Font.BOLD,54));
        t.setLineWrap(true);
    }
}
