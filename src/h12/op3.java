package h12;

import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class op3 extends Applet {
    TextField[] textvaken;
    double[] input;
    Button knop;
    TextField test;


    public void init(){
        textvaken = new TextField[5];
        input = new double[5];

        for (int teller = 0; teller < textvaken.length; teller ++) {

            textvaken[teller] = new TextField("", 30);
            add(textvaken[teller]);

        }

        knop = new Button("Ok");
        knop.addActionListener( new knopListener());
        add (knop);

    }



    public void paint(Graphics g) {}

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){

            for (int indexNumber = 0; indexNumber < textvaken.length ; indexNumber++ ){
                System.out.println(textvaken[indexNumber]);
                input[indexNumber] = Double.parseDouble(textvaken[indexNumber].getText());

            }
            Arrays.sort(input);
            for (int indexNumber = 0; indexNumber < input.length ; indexNumber++ ){
                textvaken[indexNumber].setText(input[indexNumber] + "");
            }
            repaint();

        }

    }


}