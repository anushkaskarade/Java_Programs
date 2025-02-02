import javax.swing.*;

public class Spinner {
    
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Spinner in Java");
        SpinnerModel value=new SpinnerNumberModel(
            5,//Initial value
            0,//minimum value
            10,//maximum value
            1//step
        );
        JSpinner spinner=new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        f.add(spinner);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
