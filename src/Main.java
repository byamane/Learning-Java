package src;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceThree;

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

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();

        if(correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congrats! That's the correct answer");
        } else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
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