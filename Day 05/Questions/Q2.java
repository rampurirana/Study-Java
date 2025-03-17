import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enater your name : ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to learning Java.");

        input.close();
    }
}
