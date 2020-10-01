package ho4;

import java.awt.*;
import java.applet.Applet;

public class Praktijkopdracht extends Applet {

    public void init (){
        setSize(1600,600);



    }


    public void paint(Graphics g) {
        g.drawLine(60,60, 310,60);
        g.drawRect(60,100,250,150);
        g.drawRoundRect(60,290,250,150,30,30);
        g.setColor(Color.magenta);
        g.fillRect(330,100,250,150);
        g.setColor(Color.black);
        g.drawOval(330,100,250,150);
        g.setColor(Color.magenta);
        g.fillOval(330,290,250,150);
        g.setColor(Color.black);
        g.drawOval(600,100,250,150);
        g.setColor(Color.magenta);
        g.fillArc(600,100,250,150,0,45);
        g.setColor(Color.black);
        g.drawOval(650,290,150,150);
        g.drawString("lijn",160,80);
        g.drawString("Rechthoek",160,270);
        g.drawString("Afgeronde rechthoek", 130, 460);
        g.drawString("Gevulde rechthoek met ovaal",360,270);
        g.drawString("Gevulde ovaal",400,460);
        g.drawString("Taartpunt met ovaal eromheen",640,270);
        g.drawString("cirkel", 720,460);







    }



}
