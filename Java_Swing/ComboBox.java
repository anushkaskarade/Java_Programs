import javax.swing.*;


public class ComboBox {

    public ComboBox() 
    {
        JFrame f=new JFrame("ComboBox in Java");
        String country[]={"Australia","Brazil","England","India","Newzealand","U.S.A"};
        JComboBox cb=new JComboBox(country);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }

    public static void main(String[] args) {
        new ComboBox();
    }
    
}
