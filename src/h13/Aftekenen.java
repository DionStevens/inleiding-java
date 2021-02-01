package h13;

import java.applet.Applet;
import java.awt.*;

public class Aftekenen extends Applet {
    int y;
    int x;

    public void init(){
        setSize(1000,1000);


    }



    public void paint(Graphics g) {
        y = 50;
        x = 50;
        for(int teller = 0; teller<5; teller ++) {
            y += 50;
            g.drawString("Dion", x, y);

            if (teller == 3 ) {
                y += 50;
                g.drawString("Jorn",x,y);
            }
        }
    }
}

