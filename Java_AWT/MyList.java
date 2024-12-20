import java.awt.*;

public class MyList{
    
    MyList()
    {
      Frame f=new Frame();
      List l=new List(5);
      l.setBounds(100,100,75,75);
      l.add("Item...1");
      l.add("Item..2");
      l.add("Item...3");
      f.add(l);
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyList();
    }
}
