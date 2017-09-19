import javax.swing.*;
import java.awt.*;

public class Die extends Rectangle{

    private int roll;

    private Oval one;
    private Oval two = new Oval(60,20,10,10);
    private Oval three = new Oval(20,40,10,10);
    private Oval four = new Oval(40,40,10,10);
    private Oval five = new Oval(60,40,10,10);
    private Oval six = new Oval(20,60,10,10);
    private Oval seven = new Oval(60,60,10,10);

    public Die(int x, int y){

        Rectangle theDie = new Rectangle(x,y,100,100);
        one = new Oval(20,20,10,10);
        

    }
    public static void main(String[]args){

        JFrame frame = new JFrame("Die");
        frame.setBounds(100,100,500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Die myDie = new Die(50,50);

    }

}
