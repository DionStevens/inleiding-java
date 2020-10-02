package ho5;

import java.awt.*;
import java.applet.Applet;

public class op1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;


    public void init (){
        setSize(1500, 400);
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;

    }

    public void paint (Graphics g){
        g.drawLine(100,50,300,50);
        g.drawRect(100,100,breedte,hoogte);
        g.drawRoundRect(100,225,breedte,hoogte,30,30);
        g.setColor(opvulkleur);
        g.fillRect(315,100,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315,100,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillOval(315,225,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(530,100,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530,100,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(530,225,100,100);
        g.drawString("lijn",100,65);
        g.drawString("Rechthoek",100,215);
        g.drawString("Afgeronde rechthoek", 100, 340);
        g.drawString("Gevulde rechthoek met ovaal",315,215);
        g.drawString("Gevulde ovaal",315,340);
        g.drawString("Taartpunt met ovaal eromheen",530,215);
        g.drawString("cirkel", 530,340);







    }





}
