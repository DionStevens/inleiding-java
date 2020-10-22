package h10;

import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;

public class op1 extends Applet {
int number;
TextField tekstvak;
Label label;
String tekst;
int hoogstenumber;


    public void init(){
        tekstvak = new TextField("",5);
        tekstvak.addActionListener( new Vaklistener () );
        tekst = "";

        label = new Label("voer een number in");

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g){
        g.drawString(tekst,50,45);


    }

    class Vaklistener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            String s;
            s = tekstvak.getText();
            number = Integer.parseInt( s );
            if ( number > hoogstenumber){
                hoogstenumber = number;
            }
            tekst = "het hoogtse number " + hoogstenumber;
            repaint();
        }
    }
}
