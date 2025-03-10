//Create a program that takes two numbers and show result of all arithmetic operators (+,-,*,/,%)

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNum = input.nextInt();

        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mul = firstNum * secondNum;
        int div = firstNum / secondNum;
        int mod = firstNum % secondNum;

        System.out.println("Addition is : " + add);
        System.out.println("Subtraction is : " + sub);
        System.out.println("Multiplication is : " + mul);
        System.out.println("Division is : " + div);
        System.out.println("Modulus is : " + mod);

        input.close();
    }
}
