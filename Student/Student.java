package Student;

import java.util.Scanner;

public class Student{

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

        // enter the number of students in your class

        System.out.println("Enter the number of students in your class");

        int numStudent=input.nextInt();

        String[] student=new String[numStudent];

        int [] age=new int[numStudent];

        Scanner inputName=new Scanner(System.in);
        Scanner inputAge=new Scanner(System.in);


        for(int i=0; i<numStudent; i++){
            System.out.println("Enter student name");
            student[i]=inputName.nextLine();
            System.out.println("Enter student's age");

            age[i]=inputAge.nextInt();
        }


        // run another for loop to check if age >=15

        for (int i = 0; i < numStudent; i++) {

            if(age[i]>=15){

                System.out.println(student[i] + " can receive a vaccine");
                System.out.println("The student is now " + age[i]);
            }
            
        }

        input.close();
        inputName.close();
        inputAge.close();


    }
}