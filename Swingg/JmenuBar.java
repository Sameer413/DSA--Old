package Swingg;

import javax.swing.*;

public class JmenuBar {
    public static void main(String[] args) {

    JFrame frame = new JFrame("JMenuBar");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,500);
    frame.setLocationRelativeTo(null);

    JMenuBar bar = new JMenuBar();

    JMenu menus = new JMenu("File");
    JMenuItem i1 = new JMenuItem("New");
    JMenuItem i2 = new JMenuItem("Open");
    JMenuItem i3 = new JMenuItem("Save");
    JMenuItem iy = new JMenuItem("File");
    menus.add(i1);
    menus.add(i2);
    menus.add(i3);
    menus.add(iy);
    bar.add(menus);
    frame.setJMenuBar(bar);

    JMenu edit = new JMenu("Edit");
    JMenuItem i4 = new JMenuItem("Undo");
    JMenuItem i5 = new JMenuItem("Cut");
    JMenuItem i6 = new JMenuItem("Copy");
    edit.add(i4);
    edit.add(i5);
    edit.add(i6);

    iy.add(edit);

    frame.setVisible(true);

    }
}
