import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = add.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = add.nextInt();

        int result = num1 + num2;

        System.out.print("The sum of two numbers : " + result);

        add.close();
    }
}