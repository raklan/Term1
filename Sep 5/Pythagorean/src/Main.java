import javax.swing.*;
public class Main {

    public static void main(String[] args) {

        int aNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a Value", "Input", JOptionPane.QUESTION_MESSAGE));
        int bNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a Second Value", "Input", JOptionPane.QUESTION_MESSAGE));

        double cNum = Math.sqrt((aNum*aNum)*(bNum*bNum));
        System.out.println(cNum);

        JFrame frame = new JFrame("THA THEOREM");
        frame.setVisible(true);
        frame.setBounds(60,60, 600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);



        JLabel label = new JLabel(Double.toString(cNum));
        label.setBounds(100,100,400,100);
        frame.add(label);
        label.setText("The Hypotenuse of a triangle with sides " +aNum+ " and " +bNum +" is " + cNum);
    }

}
