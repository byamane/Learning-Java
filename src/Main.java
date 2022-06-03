package src;

public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice, 
    double tipRate, 
    double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);

import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);

        input.next();
        System.out.println("It's developer tea time!");
    }


        input.next();
        System.out.println("It's developer tea time!");
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .08);
        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();
        String question = "What is the color of Clifford the big dog?";
        String choiceOne = "Blue";
        String choiceTwo = "Red";
        String choiceThree = "Green";
        
        String correctAnswer = choiceTwo;
        
        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);

    }
}
    }
      
        // Write a print statement giving the answer choices
        System.out.println(choiceOne + ", " + choiceTwo + ", " + choiceThree);
        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        if (correctAnswer.equals(userInput)){
            System.out.println("Congrats! That is the correct answer");
        } else {
            System.out.println("Incorrect! The answer was Red!");
        }

public class Main {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");

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
