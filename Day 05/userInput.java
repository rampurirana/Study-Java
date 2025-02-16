// User Input : User input in java refers to the data entered by the user while a program is the running.

import java.util.Scanner; // This imports the Scanner class from the java.util package, allowing us to take user input from the keyboard.

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object named input
        // System.in tell java to take input from the keyboard

        System.out.print("Please enter your name : ");

        String name = input.nextLine();
        // String : Data Type
        // name : variable name
        // input : object name
        // input.nextLine() : Read a full line of text entered by the user including
        // spaces.

        System.out.println("My name is " + name);
    }
}
