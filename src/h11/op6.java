package h11;

import java.awt.*;
import java.applet.Applet;

public class op6 extends Applet {

    public void init(){}


    public void paint(Graphics g){
        int teller;
        int x = 60;
        int y = 60;
        int breedte = 60;
        int hoogte = 60;

        for(teller=0; teller<5; teller++){
            x += 5;
            y += 5;
            breedte -= 10;
            hoogte -= 10;
            g.drawOval(x,y,breedte,hoogte);





        }





    }







}
