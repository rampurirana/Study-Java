// Create a program to calculate compound interest

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the principle : ");
        double principle = input.nextDouble();
        System.out.print("Please enter the interest rate : ");
        double rate = input.nextDouble();
        System.out.print("Please enter the time : ");
        double time = input.nextDouble();

        double result = principle * Math.pow((1 + rate / 100), time);

        System.out.println("The compound interest is : " + result + "rs");

        input.close();
    }
}
