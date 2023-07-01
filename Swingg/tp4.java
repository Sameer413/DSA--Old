package Swingg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Myframe extends JFrame implements ActionListener{
    Container c;
    JButton btn = new JButton("click me");
    JButton btn1 = new JButton("click me");
    JButton btn2 = new JButton("click me");
    Myframe(){
        c = getContentPane();
        c.setLayout(null);

//        btn = new JButton("Click kr");
        btn.setBounds(100,100,100,50);
        btn1.setBounds(100,200,100,50);
        btn2.setBounds(100,300,100,50);
        c.add(btn);
        c.add(btn1);
        c.add(btn2);
        btn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1){
            c.setBackground(Color.red);
        }if (e.getSource() == btn2){
            c.setBackground(Color.yellow);
        }if (e.getSource() == btn){
            c.setBackground(Color.green);
        }
    }
}
public class tp4 {

    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setTitle("Koi Hai Kya");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setBounds(100,100,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
