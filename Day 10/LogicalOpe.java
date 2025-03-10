// Logical Operator : Logical operators are used to perform logical operations on boolean values. These operations return true or false based on the condiotions

import java.util.Scanner;

public class LogicalOpe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number : ");
        int firstNum = input.nextInt();
        System.out.print("Please enter the second number : ");
        int secondNum = input.nextInt();

        // 1. Logical And (&&) : Returns true if both conditions are true
        System.out.println((firstNum == secondNum) && (firstNum <= secondNum));

        // 2. Logical Or (||) : Returns true if one conditions is true
        System.out.println((firstNum > secondNum) || (firstNum < secondNum));

        // 3. Logical Not (!) : Reverse the vlaues of a boolean expression( true becomes
        // false and false becomes true)
        boolean isNumber = (firstNum == secondNum);
        System.out.println(!isNumber);

        input.close();
    }
}
