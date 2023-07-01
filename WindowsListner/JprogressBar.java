package WindowsListner;

import javax.swing.*;
import java.awt.*;

public class JprogressBar {
    public static void main(String[] args) {
        JFrame f = new JFrame("Progress Bar");
        f.setLayout(new FlowLayout());
        f.setSize(500,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JProgressBar bar = new JProgressBar(0,100);
        bar.setStringPainted(true);
//        bar.setOrientation(SwingConstants.VERTICAL);
        f.add(bar);
        int i = 0;
        while(i<=100){
            if (i>=0 && i<=50){
                bar.setString("Processing...");
            } else if (i>50 && i< 70) {
                bar.setString("Wait for sometime");
            } else if (i>70 && i<90) {
                bar.setString("Completing");
            } else if (i == 100) {
                bar.setString("Finished");
            }
            bar.setValue(i);
            try{
            Thread.sleep(300);}catch (Exception e){

            }
            i = i+1;
        }
    }
}
