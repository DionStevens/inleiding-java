package h02;

import java.awt.*;
import java.applet.Applet;

public class applets extends Applet {


    public void init() {
        setBackground(Color.magenta);
    }



    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("welcome to java!!", 50, 60);

    }

}

