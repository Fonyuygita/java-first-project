package Vehicle;

import java.util.Scanner;

public class Vehicle {

    public static void main(String[] args) {

        System.out.println("Enter Your vehicle type");
        System.out.println("Youo can enter the following  {car, truck, bus, motorcycle}");

        Scanner input = new Scanner(System.in);

        String carType = input.nextLine();

        int premium = 0;
        // now use the switch statement

        switch (carType) {
            case "car":
                premium = 200;

                break;

            case "truck":
                premium = 300;
                break;

            case "bus":
                premium = 400;
                break;

            case "motorcycle":
                // now, there are different types of motorcycle, so we will llke to nest our
                // switch statement

                System.out.println("Enter your motorcycle type");
                System.out.println("1 ( low power), 2 (medium), 3 (high quality)");

                String motorcycleInput = input.nextLine();

                // nested switch statements here
                int motorcycleInt = Integer.parseInt(motorcycleInput);

                // converting our motorcycle string to integer
                switch (motorcycleInt) {
                    case 1:
                        premium = 300;
                        break;

                    case 2:
                        premium = 400;
                        break;

                    case 3:
                        premium = 500;
                        break;

                    default:
                        System.out.println("Unknown motorcycle");
                }
                break;
            default:
                System.out.println("Unknown vehicle type");

        }
        input.close();

        System.out.println("The premiuim is $" + premium);
    }

}