package WindowsListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JpopMenu {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Pop Menu like refresh");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(700,500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JPopupMenu pm = new JPopupMenu();
        JMenuItem m1,m2,m3,m4;


        m1 = new JMenuItem("item");
        m2 = new JMenuItem("items");
        m3 = new JMenuItem("itemss");
        m4 = new JMenuItem("itemsss");

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
        pm.add(m4);

        f.add(pm);
        pm.show(f,200,200);

        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
            }
        });

//        jaha click kiya waha jake khulega
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == MouseEvent.BUTTON3){
                    int x = e.getX();
                    int y = e.getY();
                    pm.show(f,x,y);
                }
            }
        });

    }
}


