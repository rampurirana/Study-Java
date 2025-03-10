import java.util.Scanner;

public class RelationalOpe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter the first number : ");
        int secondNum = input.nextInt();

        // Checks the relation between these two numbers
        System.out.println(firstNum + " == " + secondNum + " : " + (firstNum == secondNum)); // equal to
        System.out.println(firstNum + " != " + secondNum + " : " + (firstNum != secondNum)); // not equal to
        System.out.println(firstNum + " > " + secondNum + " : " + (firstNum > secondNum)); // greater than
        System.out.println(firstNum + " < " + secondNum + " : " + (firstNum < secondNum)); // less than
        System.out.println(firstNum + " >= " + secondNum + " : " + (firstNum >= secondNum)); // greater than or equal to
        System.out.println(firstNum + " <= " + secondNum + " : " + (firstNum <= secondNum)); // less than or equal to

        input.close();
    }
}
