package h11;

import java.awt.*;
import java.applet.Applet;

public class op8 extends Applet {

    public void init(){
        setSize(1000,2000);
    }


    public void paint(Graphics g){
        int teller;
        int x = 500;
        int y = 500;
        int breedte = 5;
        int hoogte = 5;

        for(teller=0; teller<100; teller++){
            x -= 5;
            y -= 5;
            breedte += 10;
            hoogte += 10;
            g.drawOval(x,y,breedte,hoogte);





        }





    }







}
