//Create a program that categrozide a person into different age group

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age : ");
        int age = input.nextInt();

        if (age >= 60) {
            System.out.println("Your are senior");
        } else if (age >= 20 && age < 60) {
            System.out.println("You are adult");
        } else if (age >= 13 && age < 20) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are child");
        }

        input.close();
    }
}