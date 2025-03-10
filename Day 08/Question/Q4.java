// Create a program to convert forenheit to celcius

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature of forenheit : ");
        int forenheit = input.nextInt();

        double result = (forenheit - 32) * 5 / 9;

        System.out.println("The temperature in celcius : " + result);

        input.close();
    }
}
