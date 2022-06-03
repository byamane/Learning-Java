package src;

import java.util.Scanner;

public class Main {


public class Main {
    public static void main(String[] args) {

        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        
        if (inputtedNum < 5) {
            // Print out "Enjoy the good luck a friend brings you"
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            // Print out "Your shoe selection will make you happy today"
            System.out.println("Your shoe selection will make you happy today");
        }


        double studentGPA = 3.53;
        String studentFirstName = "Brandon";
        String studentLastName = "Yamane";
        System.out.println(studentFirstName + " " +
                studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);


        double studentGPA = 3.53;
        String studentFirstName = "Brandon";
        String studentLastName = "Yamane";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + studentGPA);

        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
      
        String studentFirstName = "Brandon";
        String studentLastName = "Yamane";


        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);

        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);

        System.out.println(studentFirstName);
        System.out.println(studentLastName);

    }
}
