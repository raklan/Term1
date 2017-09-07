import javax.swing.*;

public class Main {

    public static void main(String[]args){

        solve();

    }

    public static void solve() {


        JFrame frame = new JFrame("Window");
        frame.setBounds(100,100,600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Please enter a number for the equation ax^2+bx+c=0");
        label1.setBounds(100,100,600,50);
        label1.setVisible(true);
        frame.add(label1);

        JLabel label2 = new JLabel("");
        label2.setVisible(true);
        label2.setBounds(100,200,600,50);
        frame.add(label2);

        double a=0;
        double b=0;
        double c=0;

        try {
            a = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Variable A", "Input", JOptionPane.QUESTION_MESSAGE));
            b = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Variable B", "Input", JOptionPane.QUESTION_MESSAGE));
            c = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Variable C", "Input", JOptionPane.QUESTION_MESSAGE));
        }catch(Exception e){

            JOptionPane.showMessageDialog(null,"Error: All variables must be Numbers. Please Restart");
            solve();

        }

        double answer1;
        double answer2;

        if(a!=0){

            if(((b*b)-(4*a*c))<0){

                label1.setText("Error: Answer is Imaginary");

            }
            else {
                answer1 = ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
                answer2 = ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
                label1.setText("The first possible answer is: " + Double.toString(answer1));
                label2.setText("The second possible answer is: " + Double.toString(answer2));
                System.out.println(answer1);
            }

        }
        else if(a==0){

            answer1 = ((c*-1)/b);
            label1.setText("The only possible answer is: "+Double.toString(answer1));

        }
        else
            label1.setText("Error: Something went SERIOUSLY wrong. :(");

    }
}
