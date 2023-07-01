package ListernersSwing;

import Swingg.JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JradiobtnEvents {
    public static void main(String[] args) {

        Myfame3 f= new Myfame3();
        f.setTitle("ItemEvent 1");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(Myfame.EXIT_ON_CLOSE);



        f.setVisible(true);
    }
}
class Myfame2 extends JFrame implements ItemListener {

    JRadioButton male, female;
    JTextArea ta;
    public Myfame2(){

        Container c= getContentPane();
        c.setLayout(null);

        male = new JRadioButton("male");
        female = new JRadioButton("female");
        male.setBounds(50,50,100,20);
        female.setBounds(50,100,100,20);

        c.add(male);
        c.add(female);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        male.addItemListener(this);
        female.addItemListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

                if(e.getSource() == male){
                    ta.setText("You r a male");
                }
                if(e.getSource() == female){
                    ta.setText("You r a female");
                }



    }
}class Myfame3 extends JFrame implements ItemListener {

    JCheckBox m1, m2, m3;
    JTextArea ta;
    public Myfame3(){

        Container c= getContentPane();
        c.setLayout(null);

        m1 = new JCheckBox();
        m2 = new JCheckBox();
        m3 = new JCheckBox();

        JCheckBox m = new JCheckBox();

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);



    }

    @Override
    public void itemStateChanged(ItemEvent e) {




    }
}