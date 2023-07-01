package WindowsListner;

import javax.swing.*;

public class JSplitpane {
    public static void main(String[] args) {
        new Frames();
    }
}
class Frames extends JFrame{

    Frames(){
        setTitle("JSplitterpen");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JButton btn = new JButton("left");
        JButton btn1 = new JButton("right");

        JSplitPane pen = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        pen.setTopComponent(btn);
        pen.setBottomComponent(btn1);

        pen.setDividerSize(10);
        pen.setDividerLocation(100);
        pen.setOneTouchExpandable(true);

        add(pen);
//        add(btn);
//        add(btn1);

        validate();
    }
}
