import java.applet.Applet;
import java.awt.*;

public class ButtonTest extends Applet {
    
    public void init()
    {
        Button b1,b2;
        b1=new Button("Welcome");
        add(b1);
        b2=new Button("");
        add(b2);
    }

}
