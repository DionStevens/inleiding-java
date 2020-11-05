package h11;

import java.awt.*;
import java.applet.Applet;

public class op4 extends Applet {

    public void init(){}

    public void paint(Graphics g){
        int teller;
        int y = 0;
        int eersteKeerGetal = 3;
        int tweedeKeerGetal = 1;
        int huidigeGetal;

        for(teller = 0; teller < 10; teller ++){
            y += 20;
            huidigeGetal = eersteKeerGetal * tweedeKeerGetal;
            tweedeKeerGetal++;
            g.drawString("" + huidigeGetal, 305,y);






        }




    }




}
