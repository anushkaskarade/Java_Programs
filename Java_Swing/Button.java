
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button{
    public static void main(String[] args)
    {
       JFrame f=new JFrame("Button Example")  ;
       JButton b=new JButton("Click me!");
       b.setBounds(50,100,95,30);
       f.add(b);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);

    }
}