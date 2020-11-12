package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class test extends Applet {
    String[] namen = {"1 ","Valerie","5","Jeroen","3","Sander","2","Frank"};

    public void init() {
        Arrays.sort(namen);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < namen.length; teller ++) {
            g.drawString("" + namen[teller], 50, 20 * teller + 20);
        }
    }
}
