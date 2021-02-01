package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Op3 extends Applet{
    Button muurtje;
    Button WALL;
    boolean tekenMuurtje = false;
    boolean tekenWALL = false;

    public void init(){
        setSize(10000,1000);
        muurtje = new Button("muurtje");
        muurtje.addActionListener(new KnopListener());
        WALL = new Button ("WALL");
        WALL.addActionListener(new KnopListener2());
        add(muurtje);
        add(WALL);

    }

    public void paint(Graphics g) {
        if (tekenMuurtje) muurtje(g,50,50,8,6,10,10);
        if (tekenWALL) grootmuurtje(g,100,100,4,3,20,20);
    }

    public void Backsteen(Graphics g,int x1,int y1,int width,int height) {
        g.setColor(Color.red);
        g.fillRect(x1, y1, width, height);
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
            spaceBetween = (teller % 2 == 0) ? 10 : 0;
        }

    }

    public void BetonBlock(Graphics g,int x1,int y1, int widht, int height){
        g.setColor(Color.gray);
        g.fillRect(x1,y1,widht,height);
    }

    public void grootmuurtje(Graphics g,int height,int width,int rij,int kolom,int x,int y){
        int spaceBetween = 0;
        g.fillRect(0, 0, width * kolom + kolom * 10, rij * height);
        for (int teller = 0; teller<rij; teller++){
            for (int teller2 = 0; teller2<kolom; teller2++){
                x = teller2 * width + spaceBetween;
                y = teller * height;
                BetonBlock(g,x,y,width,height);
                spaceBetween += 10;
            }
            spaceBetween = (teller % 2 == 0) ? 10 : 0;
        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekenMuurtje = true;
            tekenWALL = false;
            repaint();
        }

    }


    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekenMuurtje = false;
            tekenWALL = true;
            repaint();
        }
    }
}
