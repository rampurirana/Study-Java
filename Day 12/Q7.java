// Create a program to check the given number is odd or even, using bitwise operator

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the integer number : ");
        int num = input.nextInt();

        int check = num & 1;

        if (check == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

        input.close();
    }
}