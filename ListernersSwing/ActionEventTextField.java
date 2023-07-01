package ListernersSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventTextField {
    public static void main(String[] args) {
        MyFrame2 frame = new MyFrame2();
        frame.setTitle("Event Listeners");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
class MyFrame2 extends JFrame implements ActionListener {
    Container c;
    JTextField ti;

    public MyFrame2() {
        c = this.getContentPane();
        c.setLayout(null);
        ti = new JTextField("Click Me");
        ti.setBounds(100, 100, 100, 100);
        c.add(ti);

        ti.setFont(new Font("arial", Font.BOLD,15));
        ti.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str = ti.getText();
        ti.setText(str.toUpperCase());
    }
}
