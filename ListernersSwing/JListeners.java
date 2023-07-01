package ListernersSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListeners {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Event Listeners");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}

class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton btn;
//    public MyFrame(String title){
//        this.setTitle(title);
//        c = this.getContentPane();
//        c.setLayout(null);
//        btn = new JButton("Click Me");
//        btn.setBounds(100,100,100,30);
//        c.add(btn);
//    }
    public MyFrame(){
        c = this.getContentPane();
        c.setLayout(null);
        btn = new JButton("Click Me");
        btn.setBounds(100,100,100,30);
        c.add(btn);

        btn.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str = btn.getText();
        btn.setText(str.toUpperCase());
    }
}