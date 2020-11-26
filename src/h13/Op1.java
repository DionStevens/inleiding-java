package h13;

import java.awt.*;
import java.applet.*;

public class Op1 extends Applet {


    public void init(){
        System.out.println(add(6, 8));
        System.out.println(add(4, 2));

    }





    public void paint(Graphics g){
        tekenDriehoek(g, 10, 100, 20, 20, 30, 100 );

        tekenDriehoek(g, 100, 100, 200, 20, 300, 100 );
    }
    public void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        int x[] = new int[] {x1, x2, x3};
        int y[] = new int[] {y1, y2, y3};
        g.drawPolygon(x, y, 3);
    }
    public int add (int x, int y){
        return x + y;
    }


}