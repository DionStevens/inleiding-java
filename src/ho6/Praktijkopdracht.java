package ho6;

import java.awt.*;
import java.applet.Applet;

public class Praktijkopdracht extends Applet {
    double a,b,c,gemiddelde;




    public void init(){
        a = 5.9;
        b = 6.3;
        c = 6.9;
        gemiddelde = (a + b + c) / 3;

    }
public void paint (Graphics g){
       g.drawString("gemiddelde="+ gemiddelde ,50,50);





}




}
