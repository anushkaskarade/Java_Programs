
import javax.swing.*;

public class TabbedPane {

    public TabbedPane() 
    {
            
    JFrame f=new JFrame();
    JTextArea ta=new JTextArea(200,200);
    JPanel p1=new JPanel();
    p1.add(ta);
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    JTabbedPane t=new JTabbedPane();
    t.setBounds(50,50,200,200);
    t.add("main",p1);
    t.add("visit",p2);
    t.add("help",p3);
    f.add(t);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPane();
    }
    



    

}
