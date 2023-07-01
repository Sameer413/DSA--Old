package WindowsListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorPicker {

    public static void main(String[] args) {
        JFrame f = new JFrame("color Chooser");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        final Container c = f.getContentPane();
        c.setLayout(new GridBagLayout());

        JButton btn = new JButton("change color");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null,"color choose",Color.black);
                c.setBackground(color);
            }
        });
        c.add(btn);

        f.revalidate();
    }
}
