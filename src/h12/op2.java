package h12;

import java.applet.Applet;
import java.awt.*;

public class op2 extends Applet {
    Button[] knoppen;
    Button test;




    public void init () {
        knoppen = new Button[25];



    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < knoppen.length; teller ++) {

            test = new Button();
            test.setLabel("test");
            add(test);

        }


    }





}
