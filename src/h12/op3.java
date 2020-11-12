package h12;

import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class op3 extends Applet {
    TextField[] textvaken;
    Button knop;
    TextField test;


    public void init(){
        textvaken = new TextField[5];

        for (int teller = 0; teller < textvaken.length; teller ++) {

            test = new TextField("Hallus", 30);
            add(test);

        }

        knop = new Button("Ok");
        knop.addActionListener( new knopListener());
        add (knop);

    }



    public void paint(Graphics g) {}

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            test.setText("");
            repaint();

        }

    }


}