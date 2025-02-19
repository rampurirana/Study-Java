// Create a porgram to calculate the area of triangle

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the triangle : ");
        double height = input.nextDouble();
        System.out.print("Enter the base of the triangle : ");
        double base = input.nextDouble();

        double result = (height * base) / 2;

        System.out.println("The area of triangle is : " + result + "cm2");
    }

}