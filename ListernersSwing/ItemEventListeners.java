package ListernersSwing;

import Swingg.JcomboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventListeners {
    public static void main(String[] args) {
//        Jcombobox event listener

        Myfame f= new Myfame();
        f.setTitle("ItemEvent 1");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(Myfame.EXIT_ON_CLOSE);



        f.setVisible(true);
    }
}

class Myfame extends JFrame implements ItemListener {

    JComboBox combo;
    JTextArea ta;
    public Myfame(){

        Container c= getContentPane();
        c.setLayout(null);

        String[] value = {"1","2","3","4","5","6","7","8"};
        combo = new JComboBox(value);
        combo.setBounds(50,50,100,30);
        c.add(combo);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);

        combo.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String str = combo.getSelectedItem().toString();
        ta.setText(str);

    }
}