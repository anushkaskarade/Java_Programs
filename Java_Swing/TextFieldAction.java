import java.awt.event.*;
import javax.swing.*;

public class TextFieldAction implements ActionListener
{
    JTextField t1,t2,t3;
    JButton b1,b2;

    public TextFieldAction()
    {
        JFrame f=new JFrame();
        b1=new JButton("+");
        b2=new JButton("-");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t1.setBounds(50,50,150,20);
        t2.setBounds(50,100,150,20);
        t3.setBounds(50,150,150,20);
        b1.setBounds(50,200,50,50);
        b2.setBounds(120,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(b1);f.add(b2);f.add(t1);f.add(t2);f.add(t3);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e)
    {
       int num1=Integer.parseInt(t1.getText());
       int num2=Integer.parseInt(t2.getText());

       if(e.getSource()==b1)
       {
        t3.setText(String.valueOf(num1+num2));
       }
       else if(e.getSource()==b2)
       {
         t3.setText(String.valueOf(num1-num2));
       }

    }

    public static void main(String[] args) {
        new TextFieldAction();
    }
    
}