package Investment;

import java.util.Scanner;

public class Investment {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // take buying price from user
        System.out.println("Enter your buying price");
        double buyingPrice=input.nextDouble();
        // set the day to be 1 before you enter the while loop since w'll be taking buying price everyday

        int day=1;

        // equally set closing Price

        double closingPrice=0.1;

        while(true){
System.out.println("enter closing price for day " + day + "(enter any negative value to leave)");
closingPrice=input.nextDouble();
// if closing price is less than zero we break out of the while loop

if(closingPrice<0.0) break;

// if closing price is positive, we want to do futher calculations

double earnings=closingPrice-buyingPrice;

// checking condition arising from earning variables

if(earnings>0.0){
    System.out.println("After day" + day + " you earned " + earnings + " per share");
}

else if(earnings<0.0){
    System.out.println("After day" + day + " you  earned " + earnings+ " per day " );
}

else{
System.out.println("you earnings today is " + earnings);
}
day++;
        }

        input.close();

       
    }
    
}
