package WindowsListner;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliddder {
    public static void main(String[] args) {
        new Sliding();
    }
}
class Sliding extends JFrame implements ChangeListener{
    JSlider s;
    JLabel label;

    public Sliding(){
        setLayout(new FlowLayout());
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        s = new JSlider();
        add(s);

        s.setMinimum(0);
        s.setMaximum(200);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);


        s.addChangeListener((ChangeListener) this);
        label = new JLabel();
        label.setText("The value of Slidder :"
                + s.getValue());
        add(label);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("The value of Slidder :"
                + s.getValue());
    }
}