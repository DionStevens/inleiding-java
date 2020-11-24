package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Op4En5 extends Applet {
    TextField textFieldOne;
    Button okButton;
    double[] allNumbers;
    boolean found;
    int indexNumberMatch;

    public void init(){
        textFieldOne = new TextField();
        okButton = new Button("OK");
        okButton.addActionListener(new KnopListener());
        textFieldOne.addActionListener(new KnopListener());
        found = false;


        allNumbers = new double[30];

        add(textFieldOne); add(okButton);
        for (int indexNumber = 0; indexNumber < allNumbers.length; indexNumber++){
            allNumbers[indexNumber] = indexNumber * 1.4;
        }
    }

    public void paint (Graphics graph){
        if (found == true){
            graph.drawString("Gevonden!! op indexnumber " + indexNumberMatch, 100, 100);
        } else {
            graph.drawString("Niet gevonden!!", 100, 100);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            found = false;
            double userInput = Double.parseDouble(textFieldOne.getText());
            for (int indexNumber = 0; indexNumber < allNumbers.length; indexNumber++){
                if (userInput == allNumbers[indexNumber]){
                    indexNumberMatch = indexNumber;
                    found = true;
                    break;
                }
            }
            repaint();
        }
    }
}