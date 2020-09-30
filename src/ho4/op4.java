package ho4;

import java.awt.*;
import java.applet.Applet;

public class op4 extends Applet {


    public void init () {


    }

    public void paint (Graphics g){
        g.setColor(Color.red);
        g.fillRect(250, 250,20,40);
        g.setColor(Color.blue);
        g.fillRect(270,250,20, 100);
        g.setColor(Color.green);
        g.fillRect(290,250,20,80);
g.setColor(Color.red);
g.drawString("Valerie", 250, 240);
g.setColor(Color.blue);
g.drawString("Jeroen", 270, 230);
g.setColor(Color.green );
g.drawString("Hans", 300, 240);


    }

}
