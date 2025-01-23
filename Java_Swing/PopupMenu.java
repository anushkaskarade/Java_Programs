import java.awt.event.*;
import javax.swing.*;

public class PopupMenu {


    PopupMenu()
    {
    final JFrame f=new JFrame("PopupMenu in java");
    final JPopupMenu popupmenu =new JPopupMenu("Edit");
    JMenuItem cut=new JMenuItem("cut");
    JMenuItem copy=new JMenuItem("copy");
    JMenuItem paste=new JMenuItem("paste");
    popupmenu.add(cut);
    popupmenu.add(copy);
    popupmenu.add(paste);
    f.addMouseListener(new MouseAdapter()
    {
       public void mouseClicked(MouseEvent e)
       {
        popupmenu.show(f,e.getX(),e.getY());
       }
    });
    f.add(popupmenu);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenu();
    }

}
