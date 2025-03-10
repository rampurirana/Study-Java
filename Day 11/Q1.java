// Create a prpgram that determines if a given year is leap year

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Plese enter the year : ");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0) { // checking year like : 2024, 2025
            System.out.println(year + " is a leap year.");
        } else if (year % 400 == 0) { // checking year like : 1900, 2000, 2100
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        input.close();
    }
}