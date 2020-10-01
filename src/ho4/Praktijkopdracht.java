package ho4;

import java.awt.*;
import java.applet.Applet;

public class Praktijkopdracht extends Applet {

    public void init (){



    }


    public void paint(Graphics g) {
        g.drawLine(60,60, 310,60);
        g.drawRect(60,100,250,150);
        g.drawRoundRect(60,290,250,150,30,30);
        //help
        g.setColor(Color.magenta);
        g.fillOval(330,290,250,150);
        g.setColor(Color.black);
        g.drawOval(600,100,250,150);
        g.setColor(Color.magenta);
        g.fillArc(600,100,250,150,0,45);
        g.setColor(Color.black);
        g.drawOval(650,290,150,150);






    }



}
