package WindowsListner;

import Swingg.JCheckBox;
import Swingg.JmenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxMenuItem {
    public static void main(String[] args) {
        new CheckBox();
    }
}
class CheckBox extends JFrame{

    JMenuItem newfile = new JMenuItem("New");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem edit = new JMenuItem("edit");
    JMenuItem undo = new JMenuItem("undo");

    JCheckBoxMenuItem check = new JCheckBoxMenuItem("word wrap");
    JTextArea ta = new JTextArea("Lorem ipsum, dolor sit amet consectetur adipisicing elit. Illum, atque enim? Minima, cupiditate itaque. Obcaecati nam vel magnam error voluptas sequi, dicta quas commodi similique accusamus, provident maxime soluta veniam dignissimos molestiae porro voluptate fugiat! Dolorum distinctio natus ut, dignissimos a voluptatibus magnam dolor obcaecati.");
    public CheckBox(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JMenuBar menubar = new JMenuBar();
        add(menubar, BorderLayout.PAGE_START);

        JMenu file = new JMenu("file");
        JMenu edit = new JMenu("edit");
        JMenu format = new JMenu("format");

        menubar.add(file);
        menubar.add(edit);
        menubar.add(format);

        file.add(newfile);
        file.add(open);

        edit.add(undo);

        format.add(check);

        add(ta,BorderLayout.CENTER);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (check.isSelected()){
                    ta.setLineWrap(true);
                    ta.setWrapStyleWord(true);
                }else{
                    ta.setLineWrap(false);
                    ta.setWrapStyleWord(false);
                }

            }
        });
        validate();
    }
}