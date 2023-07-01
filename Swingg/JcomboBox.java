package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JcomboBox {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JComboBox");
//        frame.setBounds(100,100,1000,500); // this set size of window as well as the location of the window
        frame.setSize(1000,500); // set size of the window
        frame.setLocationRelativeTo(null); // this set the window in centre location
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] value = {"samy","vedant","sameer","om","nishant"};

        JComboBox c1 = new JComboBox(value);
        c1.setBounds(100,100,100,30);
        c.add(c1);


        JButton btn = new JButton("click me");
        btn.setBounds(300,100,100,30);
        c.add(btn);

        JLabel lebel = new JLabel();
        lebel.setBounds(100,300,100,100);
        c.add(lebel);

        c1.addItem("lvde");
        c1.removeItem("om");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String item = (String) c1.getSelectedItem();
//                String item = String.valueOf(c1.getSelectedIndex());
                lebel.setText(item);

            }
        });
        frame.setVisible(true);
    }
}
