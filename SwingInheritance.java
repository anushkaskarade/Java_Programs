import javax.swing.*;


public class SwingInheritance extends JFrame {

    public SwingInheritance()  
    {
       JButton b=new JButton("Click");
       b.setBounds(130,100,100,40);
       add(b);
       setSize(400,400);
       setLayout(null);
       setVisible(true);
    }
    
    public static void main(String[] args) {
        new SwingInheritance();
    }
}

//We can also inherit the JFrame class,so there is no need to create the instance of JFrame class explicitly.
