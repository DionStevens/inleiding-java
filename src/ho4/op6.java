package ho4;
import java.awt.*;
import java.applet.Applet;

public class op6 extends Applet {


    public void init (){


    }


    public void paint (Graphics g){
        g.setColor(Color.black);
        g.fillRect(200,200,150,330);
        g.setColor(Color.red);
        g.fillOval(240,220,75,75);
        g.setColor(Color.orange);
        g.fillOval(240, 320,75,75);
        g.setColor(Color.green);
        g.fillOval(240,420,75,75);


    }


}
