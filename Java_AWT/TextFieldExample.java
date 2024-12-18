import java.awt.*;

class TextFieldExample{

    public static void main(String[] args)
    {
        Frame f=new Frame("TExtField Example");
        TextField T1,T2;
        T1=new TextField("Java AWT");
        T1.setBounds(50,100,200,40);
        T2=new TextField("TextField in Java");
        T2.setBounds(50, 150, 200, 40);
        f.add(T1);
        f.add(T2);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}

