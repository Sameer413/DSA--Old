package Swingg;


import javax.swing.*;
import java.awt.*;

public class JRadiobtn {
    public static void main(String[] args) {
        JFrame f = new JFrame("JRadioButton");
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton btn = new JRadioButton("male");
        btn.setBounds(100,50,100,20);

        JRadioButton btn1 = new JRadioButton("female");
        btn1.setBounds(200,50,100,20);
        Container c = f.getContentPane();
        c.setLayout(null);
        c.add(btn);
        c.add(btn1);
//        btn1.setSelected(true);

        ButtonGroup gender = new ButtonGroup();
        gender.add(btn);
        gender.add(btn1);
        btn1.setSelected(true);
    }
}
