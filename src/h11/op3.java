package h11;

import java.awt.*;
import java.applet.Applet;

public class op3 extends Applet {

    public void init(){}


    public void paint(Graphics g){
        int teller;
        int y = 40;
        int tweeNaVorigeGetal = 1;
        int vorigeGetal =1;
        int huidigeGetal;
        g.drawString("1", 305,20);
        g.drawString("1",305,40);

        for(teller = 1; teller< 20; teller++){
            huidigeGetal = tweeNaVorigeGetal + vorigeGetal;
            y += 20;
            g.drawString("" + huidigeGetal, 305,y);
            tweeNaVorigeGetal = vorigeGetal;
            vorigeGetal = huidigeGetal;



        }





    }





}
