// Create a program to Swap two numbers

public class Q1 {
    public static void main(String[] args) {
        int numFirst = 15;
        int numSecond = 25;
        int numThird = numFirst;

        numFirst = numSecond;
        numSecond = numThird;

        System.out.println("After swapping numFirst is " + numFirst); // 25
        System.out.println("After swapping numSecond is " + numSecond); // 15
    }
}