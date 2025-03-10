// Create a program to calculate perimeter of rectangle

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance between A & B : ");
        int AB = input.nextInt();
        System.out.print("Enter the distance between B & C : ");
        int BC = input.nextInt();
        System.out.print("Enter the distance between C & D : ");
        int CD = input.nextInt();
        System.out.print("Enter the distance between A & D : ");
        int AD = input.nextInt();

        int result = AB + BC + CD + AD;

        System.out.println("Perimeter of rectangle is : " + result + "cm");

        input.close();
    }
}
