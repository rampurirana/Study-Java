public class DataTypes {
    public static void main(String args[]) {
        // Primitive Data Types Declaration
        byte ByteNumber = 100; // byte
        short ShortNumber = 1500; // short
        int IntNumber = 100000; // int
        long LongNumber = 10000000L; // long
        float FloatNumber = 10.5f; // float
        double DoubleNumber = 100.35; // double
        char Character = 'R'; // char
        boolean isNumber = true; // boolean

        // Generate output of premetive data types
        System.out.println("Byte Number : " + ByteNumber);
        System.out.println("Short Number : " + ShortNumber);
        System.out.println("Int Number : " + IntNumber);
        System.out.println("Long Number : " + LongNumber);
        System.out.println("Float Number : " + FloatNumber);
        System.out.println("Double Number : " + DoubleNumber);
        System.out.println("Character : " + Character);
        System.out.println("isNumber : " + isNumber);

        // Non - Primitive Data Types Declaration
        String fullName = "Rampravesh Rana";
        int arrayNumbers[] = { 1, 2, 3, 4 };
        /*
         * class myClass {
         * String shortName = "Rampuri";
         * int age = 20;
         * }
         */

        // Generate output of Non - premetive data types
        System.out.println("Full Name : " + fullName);
        System.out.println("Array : " + arrayNumbers[0]);
    }
}