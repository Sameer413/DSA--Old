package KeyLIsterners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouselist {
    public static void main(String[] args) {
        Myframe1 f = new Myframe1();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,700,500);
        f.setVisible(true);
    }
}
class Myframe1 extends JFrame implements MouseListener {
    JLabel label;
    JTextArea ta;

    Myframe1(){
        Container c = getContentPane();
        c.setLayout(null);

        label = new JLabel("My label");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(50,100,100,30);
        c.add(label);

        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);

        label.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText()+ "\n"+"Mouse is Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+ "\n"+"Mouse is Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+ "\n"+"Mouse is Released" );

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText()+ "\n"+"Mouse is Entered" );

    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText()+ "\n"+"Mouse is Exited" );

    }
}