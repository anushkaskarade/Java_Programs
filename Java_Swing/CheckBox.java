import javax.swing.*;

public class CheckBox {
    CheckBox()
    {
        JFrame f=new JFrame("CheckBox");
        JCheckBox c1=new JCheckBox("C++");
        JCheckBox c2=new JCheckBox("Java");
        c1.setBounds(100,100,100,50);
        c2.setBounds(100,150,100,50);
        f.add(c1);
        f.add(c2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBox();
    }
    
}
