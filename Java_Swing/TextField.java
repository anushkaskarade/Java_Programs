import javax.swing.*;
public class TextField {
    
    public static void main(String[] args) {
        JFrame f=new JFrame("TextField in java swing");
        JTextField t1,t2;
        t1=new JTextField("TextField1");
        t1.setBounds(50,100,200,30);
        t2=new JTextField("TextField2");
        t2.setBounds(50,150,200,30);
        f.add(t1);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
