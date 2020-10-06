package ho6;

import java.awt.*;
import java.applet.Applet;

public class op2 extends Applet {
    int seconde;
    int uur;
    int dag;
    int jaar;

    public void init (){
        setSize(600,600);
        seconde = 60;
        uur = seconde * 60 * 60;
        dag = uur * 24;
        jaar = dag * 365;

    }
public void paint (Graphics g){
        g.drawString("seconde =" + seconde ,50,50);
        g.drawString("uur =" + uur,50,70);
        g.drawString("dag ="+dag,50,90);
        g.drawString("jaar ="+jaar,50,110);







}






}
