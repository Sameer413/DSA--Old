package WindowsListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame {
    public WelcomeScreen(){
        diplayWelcome();
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel label = new JLabel("Welcome to Java Swing");
        add(label);
//        setVisible(true);
    }

    private void diplayWelcome() {
        final JWindow j = new JWindow(this);
        j.setSize(400,400);
        j.setLocationRelativeTo(null);
        j.setVisible(true);

        JPanel panel = new JPanel();
        j.add(panel);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        JProgressBar bar = new JProgressBar(0,100);

        j.add(BorderLayout.PAGE_END,bar);

        j.revalidate();
        time = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = bar.getValue();
                if (x == 100){
                    j.dispose();
                    WelcomeScreen.this.setVisible(true);
                    time.stop();
                }else {
                    bar.setValue(x+4);
                }
            }
        });
        time.start();
    }
    Timer time;

    public static void main(String[] args) {
        new WelcomeScreen();
    }
}
