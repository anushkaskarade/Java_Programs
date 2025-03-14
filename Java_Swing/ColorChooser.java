import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ColorChooser extends JFrame implements  ActionListener{

    JButton b; Container c;

    public ColorChooser()
    {
       c=getContentPane();
       c.setLayout(new FlowLayout());
       b=new JButton("color");
       b.addActionListener(this);
       c.add(b);
      
    }

    public void actionPerformed(ActionEvent e)
    {
      Color initialcolor=Color.RED;
      Color color=JColorChooser.showDialog(this,"Selct a color",initialcolor);
      c.setBackground(color);
    }

    public static void main(String[] args) 
    {
        ColorChooser ch=new ColorChooser();
        ch.setSize(400,400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
}