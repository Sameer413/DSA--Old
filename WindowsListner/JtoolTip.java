package WindowsListner;

import javax.swing.*;

public class JtoolTip {
    public static void main(String[] args) {
        new Tooltip();
    }
}
class Tooltip extends JFrame{


    Tooltip(){
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Pass :");
        label.setBounds(100,100,80,30);
        add(label);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(140,100,100,30);
        add(pass);

        String str ="<html>"
                + "<div bgColor='#80080' Color='#ffffff'>"
                + "Enter your pass<br/>"
                + "pass must be off 8 characters long"
                + "</div>"
                + "</html>";
        pass.setToolTipText(str);



        setLayout(null);
        setVisible(true);
    }
}
