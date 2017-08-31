/*******************************************************
 * Name: Ryan Lake
 * Assignment: A02
 *******************************************************/

public class A02
{
    public static void main(String[] args)
    {
        // example 0
        System.out.println("\n\nExample 0:");
        System.out.println("XXXX");
        System.out.println("X  X");
        System.out.println("XXXX");

        // example 1
        System.out.println("\n\nExample 1:");
        String name = "Ian";
        int weight = 94;
        System.out.println(name + " weighs " + weight + " pounds");

        // example 2
        System.out.println("\n\nExample 2:");
        int number = 10;
        System.out.println("2 * " + number + " = " + 2 * number);

        // example 3
        System.out.println("\n\nExample 3:");
        int side = 3;
        System.out.println("The perimeter of a square with side " + side + " is " + (side * 4));

        // example 4
        System.out.println("\n\nExample 4:");
        int y = 456;
        System.out.println("The value of y is " + y + ".");
        System.out.println(y%10 + " " + y%100/10 + " " + y%1000/100);

        // example 5
        System.out.println("\n\nExample 5:");
        int number1 = 21;
        if(number1 % 7 == 0)
        {
            System.out.println(number1 +" is a 3 * 7.");
        }
        if (number1 % 7 != 0)
        {
            System.out.println(number1 + " is not a multiple of 7.");
        }

        // example 6
        System.out.println("\n\nExample 6:");
        String shape = "triangle";
        if (shape == "triangle")
        {
            System.out.println("0000");
            System.out.println("000");
            System.out.println("00");
            System.out.println("0");
        }

        // example 7
        System.out.println("\n\nExample 7:");
        int n1 = 1;
        int n2 = 3;
        int n3 = 5;
        System.out.println("Number\t Square \t Cube");
        System.out.println(n1 + "\t" + n1 * n1 + "\t" + n1*n1*n1);
        System.out.println(n2 + "\t" + n2 * n2 + "\t" + n2*n2*n2);
        System.out.println(n3 + "\t" + n3 * n3 + "\t" + n3*n3*n3);

	}
}