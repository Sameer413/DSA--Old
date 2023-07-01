package WindowsListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolbar implements ActionListener{

    JToolBar toolbar = new JToolBar();
    JButton btn = new JButton("btn");
    JButton btn1 = new JButton("btn1");
    JTextField field = new JTextField();
    JComboBox combo = new JComboBox(new String[]{"sameer","vedant","om","nishant"});
    JLabel l = new JLabel();
    JToolbar(){
        JFrame f = new JFrame("Toolbar");
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        toolbar.add(combo);
        toolbar.add(field);
        toolbar.add(btn);
        toolbar.addSeparator();
        toolbar.add(btn1);

        combo.addActionListener((ActionListener) this);
        btn.addActionListener((ActionListener) this);
        btn1.addActionListener((ActionListener) this);
        field.addActionListener((ActionListener) this);

        toolbar.setFloatable(false);

        f.add(toolbar, BorderLayout.NORTH);
        f.add(l);
    }
    public static void main(String[] args) {
        new JToolbar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn){
            l.setText("btn is clicked");
        }else if (e.getSource() == btn1){
            l.setText("btn1 is clicked");

        } else if (e.getSource() == combo) {
            l.setText(combo.getSelectedItem() + " is Selected");

        } else if (e.getSource() == field) {
            l.setText("enter is pressed");

        }
    }
}
