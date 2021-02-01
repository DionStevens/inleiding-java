package h13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

int x1;
int y1;

    public void init(){
        setSize(1000,1000);

    }



    public void paint(Graphics g){
        x1 = 50;
        y1 = 150;
        for (int teller = 0;teller < 10; teller++) {
            Boom(g, x1, y1);
            x1 += 50;
            if (teller == 4 ){
                y1 = 300; x1 = 50;
            }

        }
    }

    public void Boom(Graphics g,int x1,int y1){
        g.setColor(new Color(150, 75, 0));
        g.fillRect(x1, y1, 20, 50);
        System.out.println(x1 + " " + y1);
        g.setColor(Color.green);
        g.fillOval(x1 - 5, y1 - 27, 30, 30);


    }






}
