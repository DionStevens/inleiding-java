package h12;

import java.awt.*;
import java.applet.*;

public class op1 extends Applet {
    double[] getallen;
    //double Gemiddeld[];

    public void init() {
        getallen = new double [10];



        for (int teller = 0; teller < getallen.length; teller ++) {
            getallen[teller] = 10 * teller + 10;

        }

    }

    public void paint (Graphics g) {
        for (int teller = 0; teller < getallen.length; teller ++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);

        }


    }



}
