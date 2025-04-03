// Create a program that computes the sum of digits of an integer

import java.util.Scanner;

public class Q4 {
    public static void SumOfDigit(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum = sum + (temp % 10); // last digit
            temp = temp / 10;
        }

        System.out.println("Sum of digits is : " + sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number : ");
        int num = input.nextInt();
        input.close();

        SumOfDigit(num);
    }
}