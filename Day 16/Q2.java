// using function add all odd numbers of given target

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the target number : ");
        int tarNum = input.nextInt();

        input.close();

        int result = addOddNum(tarNum);
        System.out.println(result);
    }

    public static int addOddNum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }

}