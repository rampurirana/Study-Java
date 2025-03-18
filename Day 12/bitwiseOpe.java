// Bitwise Operator : Bitwise operator work at the binary level, performing operations on individuals bits of integers

public class bitwiseOpe {
    public static void main(String args[]) {

        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // 1. AND (&) : The bitwise AND operator compares each bit of two numbers and
        // returns 1 only if both corresponding bits are 1, otherwise it returns 0.
        int andResult = a & b; // 0001 (1)
        System.out.println("The value of AND operator : " + andResult);

        // 2. OR (|) : The bitwise OR operator compares each bit of two numbers and
        // return 1 if at least one of the corresponding bits is 1.
        int orResult = a | b; // 0111 (7)
        System.out.println("The value of OR operator : " + orResult);

        // 3. XOR (^) : THe bitwise XOR operator compares each bit of two numbers and
        // returns 1 if the bits are different otherwise return 0.
        int xorResult = a ^ b; // 0110 (6)
        System.out.println("The vlaue of XOR operator : " + xorResult);

        // 4. NOT (~) : The bitwise NOT operator inverts all bits of a number (1 becomes
        // 0 and 0 becomes 1). It is also known as the one's complement
        int notResult = ~a; // -6
        System.out.println("The vlaue of NOT operator : " + notResult);

        // 5. Left Shift (<<) : The left shift operator shifts bits to the left by a
        // given number of positions, filling the vaccant bits with 0.
        int leftShift = a << 2; // 010100 (20)
        System.out.println("The vlaue of left shift : " + leftShift);

        // 6. Right Shift : The right shift operator shifts bits to the right by a given
        // number of positions, keeping the sign intact (if the number is negative then
        // fill 1).
        int rightShift = a >> 2; // 0001 (1)
        System.out.println("The value of right shift : " + rightShift);

    }
}