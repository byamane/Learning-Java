package src;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the color of Clifford the big dog?";
        String choiceOne = "Blue";
        String choiceTwo = "Red";
        String choiceThree = "Green";
        
        String correctAnswer = choiceTwo;
        
        // Write a print statement asking the question
        System.out.println(question);
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
    }
}
