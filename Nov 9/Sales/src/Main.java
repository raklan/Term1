import java.util.Random;

public class Main {

    public static void main(String[] args) {
	double[] sales = new double[7];
	Random gen = new Random();
	double max = 0;
	double min = 100;
	double avg ;
	double total = 0.0;

	for(int i = 0; i<sales.length; i++){
	    sales[i] = gen.nextDouble()+gen.nextInt(61);
    }

    for(int i = 0; i<sales.length; i++){
	    if(sales[i]>max)
	        max = sales[i];
    }
    for(int i = 0; i<sales.length; i++){
        if(sales[i]<min)
            min = sales[i];
    }

    for(int i = 0; i<sales.length; i++){
        total+=sales[i];
    }

        avg = total/sales.length;

        max = Math.round(max*100.0)/100.0;
        min = Math.round(min*100.0)/100.0;
        avg = Math.round(avg*100.0)/100.0;


        System.out.println("The maximum sales was $"+max);
        System.out.println("The minimum sales was $"+min);
        System.out.println("The average sales was $"+avg);

    }
}
