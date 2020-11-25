package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    String[] Names = {"naam1","naam2","naam3","naam4","naam5","naam6","naam7","naam8","naam9","naam10"};
    Button ButtonOk;
    double[] Numbers = {1,2,3,4,5,6,7,8,9,10};

    public void init(){
        Numbers = new double[10];
        ButtonOk = new Button("Ok");
        ButtonOk.addActionListener(new KnopListener());
        add(ButtonOk);



    }

    public void paint (Graphics g){
        for (int teller = 0; teller<Names.length;teller ++){
            g.drawString(""+Names[teller],50,20*teller+20);



        }

    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){



        }



    }




}
