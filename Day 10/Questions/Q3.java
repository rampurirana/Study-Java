//Create a program to check the greatest of three numbers

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number : ");
        int firstNum = input.nextInt();
        System.out.print("Please enter the second number : ");
        int secondNum = input.nextInt();
        System.out.print("Please enter the third number : ");
        int thirdNum = input.nextInt();

        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println("The greatest number is (first number ) : " + firstNum);
        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println("The greatest number is (second number) : " + secondNum);
        } else {
            System.out.println("The greatest number is (third number) : " + thirdNum);
        }

        input.close();
    }
}