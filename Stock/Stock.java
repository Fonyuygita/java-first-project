package Stock;
public class Stock {
    
// create the variables we need to keep track of our stocks which are price, shares, and capital
private int shares;
private double price;
private double capital;

// now let us create the three methods we need in our program

public void buy(double p, int s){
    shares+=s;
    price=p;
    capital+=s*p;
}

// let us now create our sell function

public void sell(double p, int s){
    shares-=s;
    price=p;
    capital-=s*p;
}

// now let us get our shares and price using getShares and getPrice method


public int getShares(){
    return shares;
}

public double getPrice(){
    return price;
}

public double getAverage(){
    return capital/getShares();
}

}
