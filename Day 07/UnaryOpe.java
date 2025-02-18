// Unary Operator : A unary operator is an operator that operates on a single operand

public class UnaryOpe {
    public static void main(String[] args) {
        // Negative(-) : Converts a positive value into negative
        int posNum = 10;
        int negNum = -(posNum);
        System.out.println(negNum);

        // Pre Increment : First increment the value then assign the vlaue
        int preNum = 20;
        System.out.println(++preNum); // Increase the value by 1

        // Pre decrement : First decrease the value then assign the value
        int decNum = 30;
        System.out.println(--decNum); // Decrease the value by 1

        // Post Increment : First assign the original vlaue then increase
        int postNum = 40;
        System.out.println(postNum++); // First assign the original value
        System.out.println(postNum); // Increase the value by 1

        // Post decrement : First assign the original vlaue then decrease the value
        int postDec = 50;
        System.out.println(postDec--); // First assign the original value
        System.out.println(postDec); // Decrease the value by 1
    }
}