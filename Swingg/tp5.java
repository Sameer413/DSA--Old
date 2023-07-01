package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tp5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Action Demo");
        f.setVisible(true);
        f.setBounds(100,100,1000,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("click");
        btn.setBounds(100,100,100,50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.red);
                btn.setForeground(Color.red);
            }
        });
    }
}
