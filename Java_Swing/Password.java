import java.awt.event.*;
import javax.swing.*;

public class Password {
    public static void main(String[] args) {
        JFrame f=new JFrame("Password Field");
        final JLabel label=new JLabel();
        label.setBounds(20,150,300,50);
        JPasswordField value=new JPasswordField();
        value.setBounds(100,75,100,30);
        JLabel l1=new JLabel("Username:");
        l1.setBounds(20,20,80,30);
        JLabel l2=new JLabel("Password:");
        l2.setBounds(20,75,80,30);
        JButton b=new JButton("Login");
        b.setBounds(100,120,80,30);
        JTextField text=new JTextField();
        text.setBounds(100,20,80,30);
        f.add(value);f.add(l1);f.add(l2);f.add(b);f.add(label);f.add(text);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        b.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String data="Username:\n"+text.getText();
                data+="Password: "+new String(value.getPassword());
                label.setText(data);
            }
            
        });

        
    }
    
}
