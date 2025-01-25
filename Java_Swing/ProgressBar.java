import javax.swing.*;

public class ProgressBar extends JFrame
{
    int i=0,num=0;
    JProgressBar jb;
    ProgressBar()
    {
        jb=new JProgressBar();
        int i=0,num=0;
        jb.setBounds(40,40,160,30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250,150);
        setLayout(null);
    }
    
    public void iterate()
    {
        while(i<=2000)
        {
            jb.setValue(i);
            i=i+20;
            try{Thread.sleep(150);}catch(Exception e){} 
        }
        
    }

    public static void main(String[] args) {
        ProgressBar n=new ProgressBar();
        n.setVisible(true);
        n.iterate();
    }
    
}

