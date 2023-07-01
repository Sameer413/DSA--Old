package ListernersSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventMethod {
    public static void main(String[] args) {
        MyFrame1 frame = new MyFrame1();
        frame.setTitle("Event Listeners");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
class MyFrame1 extends JFrame implements ActionListener{
    JMenuBar bar;
    JMenu file,edit;
    JMenuItem i,i1,i2,i3,i4,i5,i6;
    JTextArea ta;
    public MyFrame1(){
        Container c = getContentPane();
        c.setLayout(null);

        bar = new JMenuBar();
        file = new JMenu("file");
        edit = new JMenu("edit");

        i = new JMenuItem("New");
        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("Cut");
        i4 = new JMenuItem("Copy");
        i5 = new JMenuItem("Paste");
        i6 = new JMenuItem("Select All");

        file.add(i);
        file.add(i1);
        file.add(i2);

        edit.add(i3);
        edit.add(i4);
        edit.add(i5);
        edit.add(i6);

        bar.add(file);
        bar.add(edit);

        this.setJMenuBar(bar); // this is swing method not containers awt

        ta = new JTextArea();
        ta.setBounds(10,10,370,370);
        c.add(ta);

        i.addActionListener(this);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == i){
            ta.setText("New File");
        }
        if (e.getSource() == i1){
            ta.setText("Open File");
        }
        if (e.getSource() == i2){
            ta.setText("Save File");
        }
        if (e.getSource() == i3){
            ta.cut();
        }
        if (e.getSource() == i4){
            ta.copy();
        }
        if (e.getSource() == i5){
            ta.paste();
        }
        if (e.getSource() == i6){
            ta.selectAll();
        }

    }
}