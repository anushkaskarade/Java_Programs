import javax.swing.*;

public class ButtonImage {
    
    ButtonImage()
    {
    JFrame f=new JFrame("Button_Image");
    JButton b=new JButton(new ImageIcon("Flower.jpg"));
    b.setBounds(100,100,100,40);
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
         new ButtonImage();
    }
}
