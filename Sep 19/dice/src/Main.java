import javax.swing.*;

public class Main {

    public static void main(String[]args){

        JFrame frame = new JFrame("Die");
        frame.setBounds(100,100,1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Die dieOne = new Die(50,50);
        Die dieTwo = new Die(300,50);
        Die dieThree = new Die(50,300);
        Die dieFour = new Die(300,300);
        Die dieFive = new Die(175,450);
        frame.add(dieOne);
        frame.add(dieTwo);
        frame.add(dieThree);
        frame.add(dieFour);
        frame.add(dieFive);

        JLabel label = new JLabel("What");
        label.setBounds(175,600,100,50);
        label.setVisible(true);
        frame.add(label);

        int total = dieOne.getValue()+dieTwo.getValue()+dieThree.getValue()+dieFour.getValue()+dieFive.getValue();

        label.setText(Integer.toString(total));
    }

}
