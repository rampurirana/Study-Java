// Create a program to calculate simple interest

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the principle : ");
        double principle = input.nextDouble();
        System.out.print("Please enter the interest rate (%) : ");
        double rate = input.nextDouble();
        System.out.print("Please enter the time (years) : ");
        double time = input.nextDouble();

        double result = (principle * rate * time) / 100;

        System.out.println("The interest is : " + result + "rs");
    }
}
