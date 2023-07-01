package ListernersSwing;

import Swingg.JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class NewOne {
    public static void main(String[] args) {
       Myframe6 f = new Myframe6();
       f.setBounds(100,100,1000,500);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       f.setVisible(true);
    }
}

class Myframe6 extends JFrame implements ItemListener{

    JMenuBar bar;
    JMenu mymenu;
    JCheckBoxMenuItem box;
    JTextArea ta;
    public Myframe6(){
        Container c = getContentPane();
        c.setLayout(null);

        bar = new JMenuBar();
        mymenu = new JMenu("File");
        box = new JCheckBoxMenuItem("Friend");

        mymenu.add(box);
        bar.add(mymenu);

        this.setJMenuBar(bar);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);

        box.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    if (box.isSelected()){
        ta.setText("Print is on");
    }else {
        ta.setText("Print is off");

    }
    }
}