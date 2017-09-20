import javax.swing.*;
import java.awt.*;

public class Die{

    private int roll;

    private Oval one;
    private Oval two;
    private Oval three;
    private Oval four;
    private Oval five;
    private Oval six;
    private Oval seven;

    public Die(int x, int y){

        Rectangle theDie = new Rectangle(x,y,100,100);
        theDie.setBackground(Color.decode("#ffffff"));
        one = new Oval(20,20,10,10);
        two = new Oval(60,20,10,10);
        three = new Oval(20,40,10,10);
        four = new Oval(40,40,10,10);
        five = new Oval(60,40,10,10);
        six = new Oval(20,60,10,10);
        seven = new Oval(60,60,10,10);

        one.setBackground(Color.decode("#000000"));
        two.setBackground(Color.decode("#000000"));
        three.setBackground(Color.decode("#000000"));
        four.setBackground(Color.decode("#000000"));
        five.setBackground(Color.decode("#000000"));
        six.setBackground(Color.decode("#000000"));
        seven.setBackground(Color.decode("#000000"));

        theDie.add(one);
        theDie.add(two);
        theDie.add(three);
        theDie.add(four);
        theDie.add(five);
        theDie.add(six);
        theDie.add(seven);
    }
    public static void main(String[]args){

        JFrame frame = new JFrame("Die");
        frame.setBounds(100,100,500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Die myDie = new Die(50,50);
        Rectangle ok = new Rectangle(50,50,50,50);


    }

}
