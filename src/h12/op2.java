package h12;

import java.applet.Applet;
import java.awt.*;

public class op2 extends Applet {
    Button[] knoppen;
    Button test;


    public void init () {
        setSize(1000,1000);
        knoppen = new Button[25];


        for (int teller = 0; teller < knoppen.length; teller ++) {
            test = new Button("test");
            add(test);


        }
    }


    public void paint(Graphics g) {


    }

}
