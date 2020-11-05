package h11;

import java.awt.*;
import java.applet.Applet;

public class op7 extends Applet {

    public void init(){
        setSize(1000,1000);


    }


    public void paint(Graphics g){
        int teller;
        int x = 600;
        int y = 600;
        int breedte = 5;
        int hoogte = 5;

        for(teller=0; teller<50; teller++){
            x -= 5;
            y -= 5;
            breedte += 10;
            hoogte += 10;
            g.drawOval(x,y,breedte,hoogte);





        }





    }







}
