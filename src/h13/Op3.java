package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Op3 extends Applet{
    Button muurtje;
    Button WALL;
    int x = 0;

    public void init(){
        setSize(10000,1000);
        muurtje = new Button("muurtje");
        //muurtje.addActionListener(new KnopListener());
        WALL = new Button ("WALL");

        add(muurtje);
        add(WALL);

    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < 5; teller++) {
            x += 110;
            Muurtje(g, x, 50, 100, 50);
            Muurtje(g,x,105,100,50);
            Muurtje(g,x,160,100,50);
        }
        for (int teller = 0; teller < 5; teller++){
            x +=110;
            groterMuurtje(g,x,50,120,80);
            groterMuurtje(g,x,150,120,80);
            groterMuurtje(g,x,250,120,80);

        }
    }

    public void Muurtje(Graphics g,int x1,int y1,int width,int height) {
        g.setColor(Color.red);
        g.fillRect(x1, y1, width, height);
    }

    public void groterMuurtje(Graphics g,int x1,int y1, int widht, int height){
        g.setColor(Color.gray);
        g.fillRect(x1,y1,widht,height);

    }
    /*class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            }
            repaint();
        }

    }
*/
}
