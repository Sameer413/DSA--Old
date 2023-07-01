package WindowsListner;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChooserExam implements ActionListener{
    JFileChooser choose;
    public FileChooserExam(){
        JFrame f = new JFrame("File Chooser Example");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        f.add(panel);
        JButton btn = new JButton("Open");
        JButton btnn = new JButton("Save");
        panel.add(btn);
        panel.add(btnn);

        btn.addActionListener((ActionListener) this);
        btnn.addActionListener(this);
        f.setVisible(true);

        choose = new JFileChooser("D:\\javaSwing");

        choose.setAcceptAllFileFilterUsed(false);
        choose.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filex = new FileNameExtensionFilter("Only Text Files","txt");
        FileNameExtensionFilter filex1 = new FileNameExtensionFilter("Only Java Files",".java");

        choose.addChoosableFileFilter(filex1);
        choose.addChoosableFileFilter(filex);
    }

    public static void main(String[] args) {
        new FileChooserExam();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        int selectedOption = choose.showDialog(null,"Open my file");

//        if (selectedOption == JFileChooser.APPROVE_OPTION){
//            System.out.println("The file is : " + choose.getSelectedFile().getAbsolutePath());
//        }else {
//            System.out.println("User cancel the dialog");
//        }

        if (e.getActionCommand().equalsIgnoreCase("Open")) {
            int selectedOption = choose.showOpenDialog(null);

            if (selectedOption == JFileChooser.APPROVE_OPTION) {
// for multiple file selection
                File[] file = choose.getSelectedFiles();
                for (int i = 0; i < file.length; i++){
                    File files = file[i];
                System.out.println("The file is : " + files.getAbsolutePath());
                }
            } else {
                System.out.println("User cancel the dialog");
            }
        }else{
            int selectedOption = choose.showSaveDialog(null);

            if (selectedOption == JFileChooser.APPROVE_OPTION) {
                System.out.println("The file is : " + choose.getSelectedFile().getAbsolutePath());
            } else {
                System.out.println("User cancel the dialog");
            }
        }

    }
}
