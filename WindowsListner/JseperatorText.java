package WindowsListner;

import javax.swing.*;
import java.awt.*;

public class JseperatorText {
    public static void main(String[] args) {
        new Seperator();
    }
}
class Seperator extends JFrame{

    public Seperator(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,0));

        panel.add(new JLabel("My First Label"));
        panel.add(new JSeparator(SwingConstants.VERTICAL));
        panel.add(new JLabel("My Second Label"));
        add(panel);

        JMenuBar bar = new JMenuBar();
        add(bar,BorderLayout.PAGE_START);

        JMenu file = new JMenu("file");
        JMenu edit = new JMenu("edit");
        JMenu open = new JMenu("open");

        bar.add(file);
        bar.add(edit);
        bar.add(open);

        JMenuItem save = new JMenuItem("save");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem cut = new JMenuItem("cut");
        JMenuItem Paste = new JMenuItem("Paste");
        JMenuItem Replace = new JMenuItem("Replace");
        JMenuItem Redo = new JMenuItem("redo");

        file.add(save);
        file.add(copy);
        file.add(cut);
        file.addSeparator();
        file.add(Paste);
        file.add(Replace);
        file.addSeparator();
        file.add(Redo);
    }
}