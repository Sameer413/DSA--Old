package Swingg;

import javax.swing.*;
import java.awt.*;

public class tp1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

//        JTextField tl = new JTextField();
//        tl.setBounds(100,50,120,30);
//        c.add(tl);
//        Below is the input for swing awt
//        tl.setText("Search");
//        Font font = new Font("Arial", Font.ITALIC, 20);
//        tl.setFont(font);
//        tl.setForeground(Color.red); // changes color of the text
//        tl.setBackground(Color.green); // changes color of the background
//        tl.setEditable(false); // allows user to edit or not



        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50,120,30);
        c.add(pass);
        pass.setText("jfdslfj");
        pass.setFont(new Font("Arial", Font.PLAIN, 30));
        pass.setEchoChar('y');

        frame.setVisible(true);
    }
}
