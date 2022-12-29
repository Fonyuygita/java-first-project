package Budget;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateBudget{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // take the totaL budget you can spend

        System.out.println("How much can you spend?");

        // take the total input amount you can spend
        double total=input.nextDouble();

    System.out.println("ok are you sure you can spend " + "$" + total + " ?");
        // sum refers to the total proportion entered by the user, if sum > 100, we carry own with some computation
        double sum=0;
// i refers to the expense item index

        int i=0;

        // now let us store our prportions in an arrayList
        ArrayList<Double> proportion=new ArrayList<Double>();

        System.out.println("Enter the proportions of various expenses");
        System.out.println("The system stops if cumulative proportion exceeds 100%");

        // here we are going to use do while loop to do some calculations if sum <=100

        do {
            System.out.println("Your proportion of expenses is " + (i+1) + ":");

            double value=input.nextDouble();

            // let us add this value into our arrayList which is named proportion

            proportion.add(value);

            // now let us take the value just added into proportion ArrayList and add to the sum initially 0

            sum+=proportion.get(i);
            i++;
            
        } while (sum<=100);

        // close our scan object

        input.close();

        // now what if the sum>100. we want to do some computation

        if(sum>100){
            double cumulativeSum=0.0;

            for(int j=0; j<proportion.size()-1; j++){
                cumulativeSum+=proportion.get(j);
            }

            proportion.set(
                proportion.size()-1, 100.0-cumulativeSum);
        }

        for(double value:proportion){
            double expense=value*total/100.0;

            System.out.println("You" + value + "% equals $" + expense);
        }
    }
}