import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



        int principal;
        double monthly;
        double rate;
        int totalPayments;
        int payPerYear;

        int base;
        double height;
        int hyp;

        boolean ok = false;
        String done = null;

        while(!ok) {
            System.out.println("Enter 1(Pythagorean Theory), 2(Quadratic Formula), or 3(House Payments)");

            int choice = Integer.parseInt(scan.nextLine());
            if (choice == 1) {
                System.out.println("Enter the Height of the Ladder:");
                hyp = scan.nextInt();
                System.out.println("Enter the distance between the base of the Ladder and base of the Tree:");
                base = scan.nextInt();

                height = Math.round(pythagorean(base, hyp));
                System.out.println("The height of the tree is about "+height);
                System.out.println();
                System.out.println("Try another equation? Y/N");
                done = scan.next();
                if(done.equalsIgnoreCase("N"))
                    ok = true;
                else if(done.equalsIgnoreCase("Y"))
                    System.out.println();
                else {
                    System.out.println("Invalid Answer. Defaulting to NO");
                    ok = true;
                }
            } else if (choice == 2) {
                solve();
                System.out.println();
                System.out.println("Try another equation? Y/N");
                done = scan.next();
                if (done.equalsIgnoreCase("N"))
                    ok = true;
                else if (done.equalsIgnoreCase("Y"))
                    System.out.println();
                else{
                    System.out.println("Invalid Answer. Defaulting to NO");
                    ok = true;
                }
            } else if (choice == 3) {
                System.out.println("Please enter the Initial Payment:");
                principal = scan.nextInt();
                System.out.println("Please enter the Interest Rate:");
                rate = scan.nextDouble();
                System.out.println("Please enter the Number of Years to Pay:");
                totalPayments = scan.nextInt()*12;
                System.out.println("Please enter the Number of Payments per Year");
                payPerYear = scan.nextInt();

                monthly = Math.round(calculate(principal, rate, totalPayments, payPerYear));

                System.out.println("Your monthly payment is about "+monthly+" dollars per month");
                System.out.println();
                System.out.println("Try another equation? Y/N");
                done = scan.next();
                if (done.equalsIgnoreCase("N"))
                    ok = true;
                else if (done.equalsIgnoreCase("Y"))
                    System.out.println();
                else{
                    System.out.println("Invalid Answer. Defaulting to NO");
                    ok = true;
                }
            } else
                System.out.println("You're stupid. And I mean that in the nicest possible way.");
        }
        System.out.println("Goodbye.");
    }


    private static void solve() {



        double a=0;
        double b=0;
        double c=0;

        try {
            System.out.println("Please enter variable A:");
            a = scan.nextDouble();
            System.out.println("Please enter variable B:");
            b = scan.nextDouble();
            System.out.println("Please enter variable C:");
            c = scan.nextDouble();
        }catch(Exception e){

            System.out.println("Error: All variables must be numbers. Please restart.");
            System.out.println();
            solve();

        }

        double answer1;
        double answer2;

        if(a!=0){

            if(((b*b)-(4*a*c))<0){

                System.out.println("Error: Answer is Imaginary");

            }
            else {
                answer1 = ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
                answer2 = ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
                System.out.println("The first possible answer is: " + Double.toString(answer1));
                System.out.println("The second possible answer is: " + Double.toString(answer2));
            }

        }
        else if(a==0){

            answer1 = ((c*-1)/b);
            System.out.println("The only possible answer is: "+Double.toString(answer1));

        }
        else
            System.out.println("Error: Something went SERIOUSLY wrong. :(");

    }


    private static double calculate(int p, double r, int n, int t){

        double payment;

        payment = p*(Math.exp((r*t)))/n;

        return payment;
    }


    private static double pythagorean(int a, int c){
        double answer;

        answer=Math.sqrt((c*c-a*a));

        return answer;
    }
}
