import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Variable A", "Input", JOptionPane.QUESTION_MESSAGE));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Variable A", "Input", JOptionPane.QUESTION_MESSAGE));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Variable A", "Input", JOptionPane.QUESTION_MESSAGE));


        JFrame frame = new JFrame("Window");
        frame.setBounds(100,100,600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel errorLabel = new JLabel("A Cannot Equal 0");


        double answer1;
        double answer2;
        if(a!=0){

            answer1 = ((-b+Math.sqrt((b*b)-(4*a*c)))/(2*a));
            answer2 = ((-b-Math.sqrt((b*b)-(4*a*c)))/(2*a));
            JLabel label1 = new JLabel(Double.toString(answer1));
            JLabel label2 = new JLabel(Double.toString(answer2));
            frame.add(label1);
            frame.add(label2);
            System.out.println(answer1);

        }
        else
           frame.add(errorLabel);

    }
}
