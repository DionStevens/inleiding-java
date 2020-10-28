package h10;

import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;

public class op5 extends Applet {
    int number;
    TextField tekstvak;
    Label label;
    String tekst;
    String tekst2;
    int gemmiddelde;


    public void init(){
        tekstvak = new TextField("",5);
        tekstvak.addActionListener( new Vaklistener () );
        tekst = "";
        tekst2 = "";

        label = new Label("voer een number in");

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g){
        g.drawString(tekst,50,45);
        g.drawString(tekst2,50,55);


    }

    class Vaklistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            String s;
            s = tekstvak.getText();
            number = Integer.parseInt( s );
            if (number > 5  ) {
                tekst = "voldoende";
            }
            if (number <=5 ){
                tekst = "onvoldoende";
            }


            repaint();
        }
    }
}
