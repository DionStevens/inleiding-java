package ho8;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class op1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String s;


    public void init(){
        tekstvak = new TextField("",20);
        label = new Label("type iets in het tekstvak" + "en druk op enter");
        tekstvak.addActionListener( new Tekstvaklistener () );
        knop = new Button("Reset");
        knop.addActionListener( new Knoplistener () );
        add (tekstvak);
        add(label);
        add(knop);
        s = "";

    }

    public void paint (Graphics g){
        g.drawString(s,50,80);
    }

    class Knoplistener implements ActionListener {
        public void actionPerformed ( ActionEvent e ){
            tekstvak.setText(" ");
            repaint();

        }

    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed ( ActionEvent e ){
            s = tekstvak.getText();
            repaint();
        }

    }























}
