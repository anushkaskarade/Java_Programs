import java.awt.*;

public class CheckBoxExample{
    CheckBoxExample()
    {
        Frame f=new Frame("CheckBox Example");
        Checkbox checkBox1=new Checkbox("C++"); 
        Checkbox checkBox2=new Checkbox("Java",true);
        checkBox1.setBounds(100,100,50,50);
        checkBox2.setBounds(100,150,50,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String [] args)
    {
        new CheckBoxExample();
    }

}