import java.util.Scanner;
public class pythTheory {

    public static void main(String[]args){

        int base;
        double height;
        int hyp;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Height of the Ladder:");
        hyp = scan.nextInt();
        System.out.println("Enter the distance between the base of the Ladder and base of the Tree:");
        base = scan.nextInt();

        height = Math.round(pythagorean(base, hyp));
        System.out.println("The height of the tree is about "+height);
    }
    public static double pythagorean(int a, int c){
        double answer;

        answer=Math.sqrt((c*c-a*a));

        return answer;
    }

}
