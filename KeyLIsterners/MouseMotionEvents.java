package KeyLIsterners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionEvents {
    public static void main(String[] args) {
        Myframe2 f = new Myframe2();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,700,500);
        f.setVisible(true);
    }
}
class Myframe2 extends JFrame implements MouseMotionListener {
    JLabel label;
    JTextArea ta;

    Myframe2(){
        Container c = getContentPane();
        c.setLayout(null);

        label = new JLabel("My label");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(50,100,100,30);
        c.add(label);

        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);

        label.addMouseMotionListener(this);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+ "\n"+"Mouse is dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+ "\n"+"Mouse is moved");

    }
}