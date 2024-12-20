import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MyPanel {
    
    public static void main(String[] args) {
        Frame frame=new Frame();
        Panel panel=new Panel();
        frame.setTitle("Panel in Java");
        frame.setSize(200,200);
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.add(panel);
        frame.setVisible(true);
    }
}
