package WindowsListner;

import javax.swing.*;

public class JSpinnerS {
    public static void main(String[] args) {
        new Jspin1();
    }
}
class Jspin1 extends JFrame{

    String[] arr = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct"};
    JSpinner spin, spin1,spin2;
    SpinnerModel m,m1,m2;
    JLabel label = new JLabel();
    public Jspin1(){
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null);

        String y = String.valueOf(java.time.Year.now());
        int yi = Integer.parseInt(y);

        m = new SpinnerNumberModel(1,1,31,1);
        m1 = new SpinnerListModel(arr);
        m2 = new SpinnerNumberModel(yi,yi-100,y,1);

        spin = new JSpinner(m);
        spin1 = new JSpinner(m1);
        spin2 = new JSpinner(m2);

        spin.setBounds(100,20,100,50);
        spin1.setBounds(100,100,100,50);
        spin2.setBounds(100,200,100,50);

        add(spin);
        add(spin1);
        add(spin2);

        label.setBounds(100,300,100,100);
        setDob();
        add(label);
        setVisible(true);
        validate();
    }
    public void setDob(){
        int date = (int) spin.getValue();
        int year = (int) spin1.getValue();
        int month = (int) spin2.getValue();
        label.setText("Bob is :" + date +"" + year);
    }
}