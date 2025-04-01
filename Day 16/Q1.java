// Create a fuction program to calculate the table of given number

import java.util.Scanner;

public class Q1 {
    public void multi(int number) { // public static void multi(int number) : when use static variable then not
                                    // create any object int main method, it's direct called

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " : " + result);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter yout number : ");
        int num = input.nextInt();
        input.close();

        // multi(num;) it is work when the static varibale is defined

        Q1 data = new Q1();
        data.multi(num);
    }
}