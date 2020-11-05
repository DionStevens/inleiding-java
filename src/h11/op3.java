package h11;

import java.awt.*;
import java.applet.Applet;

public class op3 extends Applet {

    public void init(){}


    public void paint(Graphics g){
        int teller;
        int y = 0;


        for(teller = 1; teller< 100; teller++){
            y += 20;
            g.drawString("" + teller, 305,y);



        }





    }





}
