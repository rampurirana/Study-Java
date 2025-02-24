// if-else : if-else statement is used for decision making. It allow the progrma to execute different block of code based on a condition

import java.util.Scanner;

public class ifElse {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your current age : ");
        int age = input.nextInt();

        // condition to check for votting
        if (age >= 18) {
            System.out.println("You are eligible for vote."); // age is greater and equal to 18
        } else {
            System.out.println("You are not eligible for vote"); // age is less than 18
        }

    }
}
