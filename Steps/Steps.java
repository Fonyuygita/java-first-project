package Steps;

import java.util.Scanner;

public class Steps {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        
        // get number of steps
        System.out.println("input number of steps");
        int numSteps=input.nextInt();

        // get the width
System.out.println("input the width");
        int stepWidth=input.nextInt();

        for(int i=0;i<numSteps;i++){
// the first loop is for the number of steps

for(int j=0; j<(i+1)*stepWidth; j++){
    System.out.printf("*");
}

// after each steps we want to give a space

System.out.println();


        }
input.close();

    }
}
