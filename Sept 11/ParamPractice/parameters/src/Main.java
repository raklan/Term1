import java.util.Scanner;
public class Main {

    public static void main(String[]args){

        int principal;
        double monthly;
        double rate;
        int totalPayments;
        int payPerYear;

        Scanner scan = new Scanner(System.in);

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
    }

    public static double calculate(int p, double r, int n, int t){

        double payment;

        payment = p*(Math.exp((r*t)))/n;

        return payment;
    }

}

