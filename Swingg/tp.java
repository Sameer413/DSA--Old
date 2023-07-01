package Swingg;

import javax.swing.*;
import java.awt.*;

public class tp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,1000,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Vedant ka iphone wala sapna");
//        frame.setResizable(false);
//        ImageIcon icons = new ImageIcon("icons.png");
//        frame.setIconImage(icons.getImage());
//        JLabel label = new JLabel("vedant ka baccha");
//        Container c = frame.getContentPane();
////        c.add(label);
////        c.setLayout(null);
////        label.setBounds(100,100,2000,100);
////        label.setText("vedant ka kaminapan aur kaha dekhne ko milega");
////        Font font = new Font("Arial", Font.ITALIC,15);
////        label.setFont(font);
//        JLabel label1 = new JLabel(icons);
//        label1.setBounds(100,50,icons.getIconWidth(),icons.getIconHeight());
//        c.add(label1);
        Container c = frame.getContentPane();
        c.setLayout(null);
        ImageIcon icon = new ImageIcon("icons.png");

        JLabel label1 = new JLabel("text", icon, JLabel.CENTER);
        label1.setBounds(10,100,500,500);
        c.add(label1);
        frame.setVisible(true);
    }
}
