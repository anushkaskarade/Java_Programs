import javax.swing.*;

public class MenuItem {
    MenuItem()
    {
        JFrame f=new JFrame();
        JMenuBar mb=new JMenuBar();
        JMenu menu=new JMenu();
        JMenu submenu=new JMenu();
        JMenuItem i1=new JMenuItem("Item1");
        JMenuItem i2=new JMenuItem("Item2");
        JMenuItem i3=new JMenuItem("Item3");
        JMenuItem i4=new JMenuItem("Item4");
        menu.add(i1);menu.add(i2);menu.add(i3);submenu.add(i4);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);   

    }

    public static void main(String args[])
    {
        new MenuItem();
        
    }
}
