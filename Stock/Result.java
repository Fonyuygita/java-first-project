package Stock;

public class Result{
    public static void main(String[] args) {
        Stock padisco=new Stock();
        padisco.buy(36.6, 2000);
        padisco.buy(39.7, 3000);
        padisco.sell(42.9, 1000);
        System.out.println("The total share is " + padisco.getShares());
        System.out.println("The total Pricw is " + padisco.getPrice());
        System.out.println("The Average price is " + padisco.getAverage()+ "%");


    }
}