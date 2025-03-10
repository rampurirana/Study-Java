//when the multiple condition is check than used if-else-if conditional statement

import java.util.Scanner;

public class ifElseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your obtained marks : ");
        int marks = input.nextInt();

        // condition to determine the grade
        if (marks < 33) {
            System.out.println("You have failed.");
        } else if (marks >= 33 && marks < 80) {
            System.out.println("You have obtained B Grade.");
        } else {
            System.out.println("You have obtained A+ Grade.");
        }

        input.close();
    }
}
