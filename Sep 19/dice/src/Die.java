import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Die extends Rectangle{

    private int roll;

    private Oval one;
    private Oval two;
    private Oval three;
    private Oval four;
    private Oval five;
    private Oval six;
    private Oval seven;

    public Die(int x, int y){

        super(x,y,100,100);

        this.setBackground(Color.decode("#ffffff"));

        one = new Oval(20,20,10,10);
        two = new Oval(70,20,10,10);
        three = new Oval(20,45,10,10);
        four = new Oval(45,45,10,10);
        five = new Oval(70,45,10,10);
        six = new Oval(20,70,10,10);
        seven = new Oval(70,70,10,10);

        one.setBackground(Color.decode("#000000"));
        two.setBackground(Color.decode("#000000"));
        three.setBackground(Color.decode("#000000"));
        four.setBackground(Color.decode("#000000"));
        five.setBackground(Color.decode("#000000"));
        six.setBackground(Color.decode("#000000"));
        seven.setBackground(Color.decode("#000000"));

        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
    }

    public int rollDie() {

        Random gen = new Random();
        roll = gen.nextInt(6);
        return roll;
    }
    public void showDie(boolean oneOn, boolean twoOn, boolean threeOn, boolean fourOn, boolean fiveOn, boolean sixOn, boolean sevenOn){

        one.setVisible(oneOn);
        two.setVisible(twoOn);
        three.setVisible(threeOn);
        four.setVisible(fourOn);
        five.setVisible(fiveOn);
        six.setVisible(sixOn);
        seven.setVisible(sevenOn);

    }

    public static void main(String[]args){

        JFrame frame = new JFrame("Die");
        frame.setBounds(100,100,500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Die myDie = new Die(50,50);
        frame.add(myDie);



        switch(myDie.rollDie()) {
            case 0:
                myDie.showDie(false,false,false,true,false,false,false);
                break;
            case 1:
                myDie.showDie(true,false,false,false,false,false,true);
                break;
            case 2:
                myDie.showDie(true,false,false,true,false,false,true);
                break;
            case 3:
                myDie.showDie(true,true,false,false,false,true,true);
                break;
            case 4:
                myDie.showDie(true,true,false,true,false,true,true);
                break;
            case 5:
                myDie.showDie(true,true,true,false,true,true,true);
                break;
        }

    }

}
