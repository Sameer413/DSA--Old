package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tp6 {

    static Container c;
    public static void main(String[] args) {

        JFrame f = new JFrame("hi");
        f.setBounds(100,100,1000,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = f.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("click");
        JButton btn1 = new JButton("click me");
        JButton btn2 = new JButton("click us");

        btn.setBounds(100,100,100,50);
        btn1.setBounds(250,100,100,50);
        btn2.setBounds(400,100,100,50);


        c.add(btn);
        c.add(btn1);
        c.add(btn2);

        btn.addActionListener(new Btnclass());
        btn1.addActionListener(new Btnclass1());
        btn2.addActionListener(new Btnclass2());

    }
}


class Btnclass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        tp6.c.setBackground(Color.red);
    }
}class Btnclass1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        tp6.c.setBackground(Color.green);
    }
}
class Btnclass2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        tp6.c.setBackground(Color.yellow);
    }
}
