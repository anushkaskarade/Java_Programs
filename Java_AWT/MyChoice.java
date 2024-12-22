import java.awt.*;

public class MyChoice{

    public MyChoice() {
        Frame f=new Frame();
        Choice c=new Choice();
        c.setBounds(100,100,75,75);
        c.add("Item.c..1");
        c.add("Item....2");
        c.add("Item....3");
        c.add("Item....4");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args)
    {
        new MyChoice();
    }

    
}