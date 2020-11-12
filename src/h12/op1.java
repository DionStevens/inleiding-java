package h12;

import java.awt.*;
import java.applet.*;

public class op1 extends Applet {
    int[] huidigGetal;
    double Gemiddeld;
    int vorigGetal;

    public void init() {
        huidigGetal = new int [10];




        for (int teller = 0; teller < huidigGetal.length; teller ++) {
            huidigGetal[teller] = 10 * teller + 10;

        }

    }

    public void paint (Graphics g) {




        for (int teller = 0; teller < huidigGetal.length; teller ++) {

            g.drawString("" + huidigGetal[teller], 50, 20 * teller + 20);
            vorigGetal += huidigGetal[teller];


        }
        Gemiddeld = vorigGetal * 0.10;
        g.drawString("het gemiddelde is " + Gemiddeld,80,20);


    }



}
