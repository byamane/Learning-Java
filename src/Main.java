package src;

import java.util.Scanner;

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
    }
}
