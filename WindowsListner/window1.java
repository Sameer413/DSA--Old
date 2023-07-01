package WindowsListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window1 {
    public static void main(String[] args) {
        myframe f = new myframe();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,700,500);
        f.setVisible(true);
    }
}
class myframe extends JFrame implements WindowListener {

    myframe(){
        Container c = getContentPane();
        c.setLayout(null);

        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}