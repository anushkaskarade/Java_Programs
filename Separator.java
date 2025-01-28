import javax.swing.*;

public class Separator {

    public Separator() 
    {
        JMenu menu=new JMenu("Menu");
        JMenu submenu=new JMenu("submenu");
        JFrame f=new JFrame("Seperator in java");
        JMenuBar mb=new JMenuBar();
        JMenuItem i1=new JMenuItem("Item 1");
        JMenuItem i2=new JMenuItem("Item 2");
        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Separator();
    }
    
}
