package WindowsListner;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTrees{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);


        DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("top");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("b");


        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");

        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("b3");

        a.add(a1);
        a.add(a2);

        b.add(b1);
        b.add(b2);
        a.add(b3);

        rootnode.add(a);
        rootnode.add(b);

        JTree tre = new JTree(rootnode);
        f.add(tre);
        f.setVisible(true);

    }
}
