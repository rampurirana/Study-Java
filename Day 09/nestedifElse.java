//An if statement inside another if statement is called a nested if-else.

import java.util.Scanner;

public class nestedifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your current age : ");
        int age = input.nextInt();
        System.out.print("Please enter your current weight : ");
        int weight = input.nextInt();

        // condition to check for donatting blood
        if (age >= 18) {
            if (weight >= 60) {
                System.out.println("You are eligible for donate blood.");
            } else {
                System.out.println(
                        "You are not eligible for donate blood because your weight is not met our requirements.");
            }
        } else {
            System.out.println("You are not eligible for donate blood because age restrictions.");
        }

        input.close();
    }
}
