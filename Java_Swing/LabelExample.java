import java.awt.event.*;
import javax.swing.*;

public class LabelExample extends JFrame implements ActionListener{
       JTextField tf;
       JLabel l1;
       JLabel l2;
       JButton b;

    public LabelExample()
    {
       l2=new JLabel("Enter Your Name:");
       l2.setBounds(50,20,250,20);
       tf=new JTextField();
       tf.setBounds(50,50,150,20);
       l1=new JLabel();
       l1.setBounds(50,100,250,20);
       b=new JButton("Click me!");
       b.setBounds(50,150,95,30);
       b.addActionListener(this);
       add(b);
       add(tf);
       add(l1);
       add(l2);
       setSize(400,400);
       setLayout(null);
       setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
      String text = tf.getText();
      l1.setText("Name: " + text);
    }

    
       
   public static void main(String[] args) {
       new LabelExample();
   }
    
}
