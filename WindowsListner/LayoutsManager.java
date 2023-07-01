package WindowsListner;

import javax.swing.*;

public class LayoutsManager {
    public static void main(String[] args) {
        Myframes frame = new Myframes();
        frame.setLayout(frame.getLayout());
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class Myframes extends JFrame{

}