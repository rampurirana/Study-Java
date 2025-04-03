// Write a function that calculates the factorial of given number

import java.util.Scanner;

public class Q3 {

    public void factorial(int number) {
        if (number < 0) {
            System.out.println("Plese enter valid number");
            return;
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Factorial is : " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number : ");
        int num = input.nextInt();
        input.close();

        Q3 data = new Q3();
        data.factorial(num);
    }
}