package Time;

import java.util.Scanner;

public class Timer{
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
System.out.println("Enter the current hour");

int currentHour=input.nextInt();

System.out.println("Enter the current Minute");

int currentMinute=input.nextInt();

System.out.println("Enter the current second");

int currentSecond=input.nextInt();


System.out.println("The time is " + currentHour+ " : " + currentMinute + " : " + currentSecond );


// this section is going to receive input, by what interval do we want to increase or time, be it second, minute or hour

System.out.println("Enter hour to go forward");

int forwardHour=input.nextInt();

System.out.println("Enter Minute to move forward");

int forwardMinute=input.nextInt();

System.out.println("Enter seconds to move forward");

int forwardSeconds=input.nextInt();

// end of forward time section


// now we are going to to the  actual calculatio n in this program



// start by initiaizing our results, for seconds, minutes , and hour to zero


int answerHour=0, answerMinute=0, answerSeconds=0;

// once minute and seconds elapses we want to set it to 1

int carrySecond=0, carryMinute=0;

// variable to check whedther is next day or not

boolean isNextDay=false;

// now take the initial second and add to forwardSecond, then that will be yogur answer second

answerSeconds=currentSecond+forwardSeconds;

if(answerSeconds>=60){
    answerSeconds-=60;
    carrySecond=1;
}



answerMinute=currentMinute+forwardMinute+carrySecond;

if(answerMinute>=60){
    answerMinute-=60;

    carryMinute=1;
}

// then we want to work with the hour

answerHour=currentHour+forwardHour+carryMinute;

// Now we check, if its new day?

if(answerHour>=24){
    answerHour=24;
    isNextDay=true;
}


if(isNextDay){
    System.out.println("The time is " + answerHour+ " : " + answerMinute + " : " + answerSeconds );
}

else{
    System.out.println("The time is " + answerHour+ " : " + answerMinute + " : " + answerSeconds );

}

input.close();
    }



}