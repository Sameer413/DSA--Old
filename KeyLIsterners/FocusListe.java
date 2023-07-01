package KeyLIsterners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FocusListe {
    public static void main(String[] args) {
        Myframe3 f = new Myframe3();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,700,500);
        f.setVisible(true);
    }
}
class Myframe3 extends JFrame implements FocusListener {
//    JLabel label;
    JTextArea ta;
    JTextField ti;

    Myframe3(){
        Container c = getContentPane();
        c.setLayout(null);

//        label = new JLabel("My label");
//        label.setFont(new Font("Arial", Font.BOLD, 18));
//        label.setBounds(50,100,100,30);
//        c.add(label);

        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);

        ti = new JTextField("My Field");
        ti.setFont(new Font("Arial", Font.BOLD, 18));
        ti.setBounds(20,100,100,30);
        c.add(ti);

        ti.addFocusListener(this);
    }


    @Override
    public void focusGained(FocusEvent e) {
        ta.setText(ta.getText() + "\n" + "Focused is Gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText() + "\n" + "Focused is Lost");

    }
}
