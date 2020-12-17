package h13;

import java.awt.*;
import java.applet.*;

public class Op2 extends Applet {


    public void init(){
        setSize(1000, 1000);

    }


    public void paint(Graphics g){
       muurtje(g,50,50,8,6,10,10);

    }

    public void Backsteen(Graphics g,int x1,int y1,int width,int height){
        g.setColor(Color.red);
        g.fillRect(x1,y1,width,height);

    }

    public void muurtje(Graphics g,int height,int width,int rij,int kolom,int x,int y){
        int spaceBetween = 0;
        g.fillRect(0, 0, width * kolom + kolom * 10, rij * height);
        for (int teller = 0; teller<rij; teller++){
            for (int teller2 = 0; teller2<kolom; teller2++){
                x = teller2 * width + spaceBetween;
                y = teller * height;
                Backsteen(g,x,y,width,height);
                spaceBetween += 10;
            }
            spaceBetween = (teller % 2 == 0) ? 10 : 0; //ternary => googlelen



        }

    }

}