package h13;

import java.awt.*;
import java.applet.*;

public class Op2 extends Applet {


    public void init(){


    }


    public void paint(Graphics g){
        int x = 0;
        for (int teller = 0 ; teller < 5 ; teller++) {
            x += 110;
            Muurtje(g, x, 50, 100, 50);
            Muurtje(g,x,105,100,50);
            Muurtje(g,x,160,100,50);
        }

    }

    public void Muurtje(Graphics g,int x1,int y1,int width,int height){
        g.setColor(Color.red);
        g.fillRect(x1,y1,width,height);






    }

}

