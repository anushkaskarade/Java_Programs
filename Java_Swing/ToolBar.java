import java.awt.*;
import javax.swing.*;

public class ToolBar {
    public static void main(final String[] args) {
        JFrame myframe=new JFrame("JToolBar in Java");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar T=new JToolBar();
        T.setRollover(true);

        JButton button =new JButton("File");
        T.add(button);
        T.addSeparator();
        T.add(new JButton("Edit"));
        T.add(new JComboBox<>(new String[]{"Opr-1","Opt-2","Opt-3","Opt-4"}));
        Container contentPane=myframe.getContentPane();
        contentPane.add(T,BorderLayout.NORTH);
        JTextArea textarea=new JTextArea();
        JScrollPane mypane=new JScrollPane(textarea);
        contentPane.add(mypane,BorderLayout.EAST);
        myframe.setSize(450,250);
        myframe.setVisible(true);

    }
}
