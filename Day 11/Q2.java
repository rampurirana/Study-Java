//Create a program that calculate grade based on marks

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your marks (100) : ");
        int marks = input.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A Grade");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("B Grade");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("C Grade");
        } else if (marks >= 30 && marks < 60) {
            System.out.println("D Grade");
        } else {
            System.out.println("F Grade");
        }

        input.close();
    }
}