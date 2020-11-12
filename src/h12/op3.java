package h12;

//import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;

public class op3 extends Applet {
    TextField[] textvaken;
    Button knop;
    TextField test;


    public void init(){
        textvaken = new TextField[5];
        knop = new Button("test");
        add (knop);


    }



    public void paint(Graphics g){
        for (int teller = 0; teller < textvaken.length; teller ++){
            g.drawString("hallus",50,20*teller+20);

            test = new TextField("Hallus",30);
            add (test);

        }
        repaint();

    }


}
