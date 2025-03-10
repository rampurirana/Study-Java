//Create a program to calculate product of two floating point numbers

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first floating number : ");
        float firstNum = input.nextFloat();
        System.out.print("Please enter the second floating number : ");
        float secondNum = input.nextFloat();

        float result = firstNum * secondNum;

        System.out.println("Prodict of two floating number : " + result);

        input.close();
    }
}
