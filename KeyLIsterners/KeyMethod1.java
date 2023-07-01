package KeyLIsterners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMethod1 {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Key Event Method 1");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

class Myframe extends JFrame implements KeyListener {
    JTextArea ta;

    public Myframe(){
    Container c = getContentPane();
    c.setLayout(null);

    ta = new JTextArea();
    ta.setBounds(10,10,370,330);
    c.add(ta);
    ta.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"typed  "+ e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"pressed  "+ e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"released  "+ e.getKeyChar());
    }
}
