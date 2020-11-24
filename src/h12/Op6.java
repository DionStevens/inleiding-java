package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Op6 extends Applet {
    TextField textFieldOne;
    Button okButton;
    double[] allNumbers;
    boolean found;
    int timesFound;

    public void init(){
        textFieldOne = new TextField();
        okButton = new Button("OK");
        okButton.addActionListener(new KnopListener());
        textFieldOne.addActionListener(new KnopListener());
        found = false;
        timesFound = 0;


        allNumbers = new double[30];

        add(textFieldOne); add(okButton);
        for (int indexNumber = 0; indexNumber < allNumbers.length; indexNumber++){
            if (indexNumber % 2 == 0) {
                allNumbers[indexNumber] = indexNumber;
            } else {
                allNumbers[indexNumber] = indexNumber - 1;
            }
            System.out.println(allNumbers[indexNumber]);
        }
    }

    public void paint (Graphics graph){
        if (found == true){
            graph.drawString("Gevonden!! aantal keer: " + timesFound , 100, 100);
        } else {
            graph.drawString("Niet gevonden!!", 100, 100);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            found = false; timesFound = 0;
            double userInput = Double.parseDouble(textFieldOne.getText());
            for (int indexNumber = 0; indexNumber < allNumbers.length; indexNumber++){
                if (userInput == allNumbers[indexNumber]){
                    found = true;
                    timesFound++;
                }
            }
            repaint();
        }
    }
}