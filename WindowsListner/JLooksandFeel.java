package WindowsListner;

import javax.swing.*;

public class JLooksandFeel extends JFrame {
    public JLooksandFeel(){
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        JLabel label = new JLabel("Username : ");
        JLabel labell = new JLabel("Password : ");

        JTextField text = new JTextField();
        JPasswordField pass = new JPasswordField();
        JButton clear = new JButton("Clear");
        JButton loginbtn = new JButton("Login");

        label.setBounds(50,50,100,30);
        labell.setBounds(50,100,100,30);

        text.setBounds(140,50,120,30);
        pass.setBounds(140,100,120,30);
        clear.setBounds(80,150,80,30);
        loginbtn.setBounds(170,150,80,30);

        add(label);
        add(labell);
        add(text);
        add(pass);
        add(clear);
        add(loginbtn);
    }

    public static void main(String[] args) {
        new JLooksandFeel();
    }
}
