import java.applet.*;
import java.awt.*;

public class Sample extends Applet{

   String msg;
   public void init()
   {
       setBackground(Color.ORANGE);
       setForeground(Color.BLACK);
       msg="Inside inti()....";
   }

   public void start()
   {
    msg+="Inside start()....";
   }

   public void paint(Graphics g)
   {
       msg+="Inside paint()....";
       g.drawString(msg,10,30);
   }


}