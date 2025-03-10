// Create a prpgram that determines if a given year is leap year

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Plese enter the year : ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }
    }
}