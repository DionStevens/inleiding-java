package ho6;

import java.awt.*;
import java.applet.Applet;

public class op1 extends Applet {
    int totaal;
    int gedeeld;

    public void init (){
        setSize(600,600);
        totaal = 113;
        gedeeld = totaal / 4;


    }
public void paint (Graphics g){
        g.drawString("Jan krijgt:" + gedeeld  ,50,50);
        g.drawString("Ali krijgt:" + gedeeld ,50,70);
        g.drawString("Jeannette krijgt:" + gedeeld, 50,90);
        g.drawString("Ik krijg:" + gedeeld, 50, 110);





}






}
