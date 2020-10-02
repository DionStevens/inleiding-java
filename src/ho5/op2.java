package ho5;

import java.awt.*;
import java.applet.Applet;

public class op2 extends Applet {
    Color Valerie;
    Color Jeroen;
    Color Hans;
    int gewicht1;
    int gewicht2;
    int gewicht3;



    public void init (){
        setSize(600,600);
        Valerie = Color.RED;
        Jeroen = Color.blue;
        Hans = Color.green;
        gewicht1 = 40;
        gewicht2 = 100;
        gewicht3 = 80;

        }

    public void paint (Graphics g){
        g.setColor(Valerie);
        g.fillRect(250, 250,20,gewicht1);
        g.setColor(Jeroen);
        g.fillRect(270,250,20, gewicht2);
        g.setColor(Hans);
        g.fillRect(290,250,20,gewicht3);
        g.setColor(Valerie);
        g.drawString("Valerie", 250, 240);
        g.setColor(Jeroen);
        g.drawString("Jeroen", 270, 230);
        g.setColor(Hans);
        g.drawString("Hans", 300, 240);



    }





    }



