package h11;

import java.awt.*;
import java.applet.Applet;

public class op5 extends Applet {

    public void init(){}


    public void paint (Graphics g){
        int teller;
        int x = 0;
        int y = 0;

        for(teller=0; teller<5; teller++){
            x += 20;
            y += 20;
            g.drawRect(x,y,20,20);




        }



    }



}
