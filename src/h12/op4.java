package h12;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class op4 extends Applet {
    boolean gevonden;
    TextField tekstvak;
    double[] Getal;
    Button knop;

    public void init (){

        tekstvak = new TextField("",30);
        Getal = new double[10];
        knop = new Button("zoek");
        add(knop);
        add(tekstvak);

    }


    public void paint (Graphics g) {
    }




}
