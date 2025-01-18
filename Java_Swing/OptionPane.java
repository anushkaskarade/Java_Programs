import javax.swing.*;

public class OptionPane 
{

    public OptionPane() 
    {
        JFrame f=new JFrame("OPtionPane in java");
        JOptionPane.showMessageDialog(f,"Hello,Welcome!");
    }
    
    public static void main(String[] args) {
        new OptionPane();
    }

}
